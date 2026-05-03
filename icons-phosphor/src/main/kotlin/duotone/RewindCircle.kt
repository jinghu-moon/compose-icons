package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorDuotoneIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 128.000 32.000 C 74.981 32.000 32.000 74.981 32.000 128.000 C 32.000 181.019 74.981 224.000 128.000 224.000 C 181.019 224.000 224.000 181.019 224.000 128.000 C 224.000 74.981 181.019 32.000 128.000 32.000 ZM 112.000 164.000 L 64.000 128.000 L 112.000 92.000 ZM 176.000 164.000 L 128.000 128.000 L 176.000 92.000 Z"),
                    pathFillType = PathFillType.NonZero,
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1f,
                    stroke = null,
                    strokeAlpha = 1f,
                    strokeLineWidth = 0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                )
            }
            addPath(
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 115.580 84.840 C 112.868 83.485 109.624 83.779 107.200 85.600 L 59.200 121.600 C 57.186 123.111 56.000 125.482 56.000 128.000 C 56.000 130.518 57.186 132.889 59.200 134.400 L 107.200 170.400 C 108.585 171.439 110.269 172.000 112.000 172.000 C 116.418 172.000 120.000 168.418 120.000 164.000 L 120.000 92.000 C 120.002 88.969 118.291 86.197 115.580 84.840 ZM 104.000 148.000 L 77.330 128.000 L 104.000 108.000 ZM 179.580 84.840 C 176.868 83.485 173.624 83.779 171.200 85.600 L 123.200 121.600 C 121.186 123.111 120.000 125.482 120.000 128.000 C 120.000 130.518 121.186 132.889 123.200 134.400 L 171.200 170.400 C 172.585 171.439 174.269 172.000 176.000 172.000 C 180.418 172.000 184.000 168.418 184.000 164.000 L 184.000 92.000 C 184.002 88.969 182.291 86.197 179.580 84.840 ZM 168.000 148.000 L 141.330 128.000 L 168.000 108.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
