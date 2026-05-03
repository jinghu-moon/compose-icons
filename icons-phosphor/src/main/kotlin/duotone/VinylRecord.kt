package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) return _vinylRecord!!
        _vinylRecord = phosphorDuotoneIcon(
            name = "VinylRecord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 128.000 32.000 C 74.981 32.000 32.000 74.981 32.000 128.000 C 32.000 181.019 74.981 224.000 128.000 224.000 C 181.019 224.000 224.000 181.019 224.000 128.000 C 224.000 74.981 181.019 32.000 128.000 32.000 ZM 128.000 152.000 C 114.745 152.000 104.000 141.255 104.000 128.000 C 104.000 114.745 114.745 104.000 128.000 104.000 C 141.255 104.000 152.000 114.745 152.000 128.000 C 152.000 141.255 141.255 152.000 128.000 152.000 Z"),
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
                pathData = parseSvgPathData("M 128.000 24.000 C 70.562 24.000 24.000 70.562 24.000 128.000 C 24.000 185.438 70.562 232.000 128.000 232.000 C 185.438 232.000 232.000 185.438 232.000 128.000 C 231.939 70.588 185.412 24.061 128.000 24.000 ZM 128.000 216.000 C 79.399 216.000 40.000 176.601 40.000 128.000 C 40.000 79.399 79.399 40.000 128.000 40.000 C 176.601 40.000 216.000 79.399 216.000 128.000 C 215.945 176.578 176.578 215.945 128.000 216.000 ZM 128.000 72.000 C 97.086 72.033 72.033 97.086 72.000 128.000 C 72.000 132.418 68.418 136.000 64.000 136.000 C 59.582 136.000 56.000 132.418 56.000 128.000 C 56.044 88.254 88.254 56.044 128.000 56.000 C 132.418 56.000 136.000 59.582 136.000 64.000 C 136.000 68.418 132.418 72.000 128.000 72.000 ZM 200.000 128.000 C 199.956 167.746 167.746 199.956 128.000 200.000 C 123.582 200.000 120.000 196.418 120.000 192.000 C 120.000 187.582 123.582 184.000 128.000 184.000 C 158.914 183.967 183.967 158.914 184.000 128.000 C 184.000 123.582 187.582 120.000 192.000 120.000 C 196.418 120.000 200.000 123.582 200.000 128.000 ZM 160.000 128.000 C 160.000 110.327 145.673 96.000 128.000 96.000 C 110.327 96.000 96.000 110.327 96.000 128.000 C 96.000 145.673 110.327 160.000 128.000 160.000 C 145.673 160.000 160.000 145.673 160.000 128.000 ZM 112.000 128.000 C 112.000 119.163 119.163 112.000 128.000 112.000 C 136.837 112.000 144.000 119.163 144.000 128.000 C 144.000 136.837 136.837 144.000 128.000 144.000 C 119.163 144.000 112.000 136.837 112.000 128.000 Z"),
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
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
