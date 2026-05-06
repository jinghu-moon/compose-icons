package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) return _eggCrack!!
        _eggCrack = phosphorRegularIcon(
            name = "EggCrack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M186.66 59.56C168.47 32.29 146.54 16 128 16 109.46 16 87.53 32.29 69.34 59.56 50.7 87.54 40 121.23 40 152c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88C216 121.23 205.3 87.54 186.66 59.56ZM128 224C88.254 223.956 56.044 191.746 56 152 56 124.31 65.72 93.85 82.66 68.44 97.19 46.64 115.41 32 128 32c9.5 0 22.2 8.33 34.1 21.78L122 98.67c-1.866 2.086-2.507 4.995-1.689 7.672 .818 2.677 2.975 4.731 5.689 5.418l24.6 6.15-6.5 32.52c-.865 4.329 1.942 8.541 6.27 9.41 .536 .111 1.083 .164 1.63 .16 3.808-.007 7.083-2.696 7.83-6.43l8-40c.838-4.186-1.759-8.292-5.9-9.33L142.77 99.45 172.1 66.6c.42 .61 .83 1.22 1.24 1.84C190.28 93.85 200 124.31 200 152c-.044 39.746-32.254 71.956-72 72Z"),
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
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
