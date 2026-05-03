package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorDuotoneIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 144.000 L 208.000 144.000 C 208.000 188.183 172.183 224.000 128.000 224.000 C 79.399 224.000 40.000 184.601 40.000 136.000 C 40.000 82.981 82.981 40.000 136.000 40.000 C 193.438 40.000 240.000 86.562 240.000 144.000 Z"),
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
                pathData = parseSvgPathData("M 248.000 144.000 C 248.000 148.418 244.418 152.000 240.000 152.000 C 235.582 152.000 232.000 148.418 232.000 144.000 C 231.939 91.006 188.994 48.061 136.000 48.000 C 87.422 48.055 48.055 87.422 48.000 136.000 C 48.050 180.162 83.838 215.950 128.000 216.000 C 167.746 215.956 199.956 183.746 200.000 144.000 C 199.961 108.670 171.330 80.039 136.000 80.000 C 105.086 80.033 80.033 105.086 80.000 136.000 C 80.028 162.498 101.502 183.972 128.000 184.000 C 150.091 184.000 168.000 166.091 168.000 144.000 C 168.000 126.327 153.673 112.000 136.000 112.000 C 122.745 112.000 112.000 122.745 112.000 136.000 C 112.000 144.837 119.163 152.000 128.000 152.000 C 132.418 152.000 136.000 148.418 136.000 144.000 C 131.582 144.000 128.000 140.418 128.000 136.000 C 128.000 131.582 131.582 128.000 136.000 128.000 C 144.837 128.000 152.000 135.163 152.000 144.000 C 152.000 157.255 141.255 168.000 128.000 168.000 C 110.327 168.000 96.000 153.673 96.000 136.000 C 96.000 113.909 113.909 96.000 136.000 96.000 C 162.498 96.028 183.972 117.502 184.000 144.000 C 183.967 174.914 158.914 199.967 128.000 200.000 C 92.670 199.961 64.039 171.330 64.000 136.000 C 64.044 96.254 96.254 64.044 136.000 64.000 C 180.162 64.050 215.950 99.838 216.000 144.000 C 215.945 192.578 176.578 231.945 128.000 232.000 C 75.006 231.939 32.061 188.994 32.000 136.000 C 32.061 78.588 78.588 32.061 136.000 32.000 C 197.828 32.066 247.934 82.172 248.000 144.000 Z"),
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
        return _spiral!!
    }

private var _spiral: ImageVector? = null
