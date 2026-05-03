package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Info: ImageVector
    get() {
        if (_info != null) return _info!!
        _info = phosphorDuotoneIcon(
            name = "Info",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 128.000 C 224.000 181.019 181.019 224.000 128.000 224.000 C 74.981 224.000 32.000 181.019 32.000 128.000 C 32.000 74.981 74.981 32.000 128.000 32.000 C 181.019 32.000 224.000 74.981 224.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 144.000 176.000 C 144.000 180.418 140.418 184.000 136.000 184.000 C 127.163 184.000 120.000 176.837 120.000 168.000 L 120.000 128.000 C 115.582 128.000 112.000 124.418 112.000 120.000 C 112.000 115.582 115.582 112.000 120.000 112.000 C 128.837 112.000 136.000 119.163 136.000 128.000 L 136.000 168.000 C 140.418 168.000 144.000 171.582 144.000 176.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 216.000 128.000 C 216.000 79.399 176.601 40.000 128.000 40.000 C 79.399 40.000 40.000 79.399 40.000 128.000 C 40.000 176.601 79.399 216.000 128.000 216.000 C 176.578 215.945 215.945 176.578 216.000 128.000 ZM 124.000 96.000 C 130.627 96.000 136.000 90.627 136.000 84.000 C 136.000 77.373 130.627 72.000 124.000 72.000 C 117.373 72.000 112.000 77.373 112.000 84.000 C 112.000 90.627 117.373 96.000 124.000 96.000 Z"),
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
        return _info!!
    }

private var _info: ImageVector? = null
