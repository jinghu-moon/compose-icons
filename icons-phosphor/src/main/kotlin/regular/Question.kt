package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Question: ImageVector
    get() {
        if (_question != null) return _question!!
        _question = phosphorRegularIcon(
            name = "Question",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 140.000 180.000 C 140.000 186.627 134.627 192.000 128.000 192.000 C 121.373 192.000 116.000 186.627 116.000 180.000 C 116.000 173.373 121.373 168.000 128.000 168.000 C 134.627 168.000 140.000 173.373 140.000 180.000 ZM 128.000 72.000 C 105.940 72.000 88.000 88.150 88.000 108.000 L 88.000 112.000 C 88.000 116.418 91.582 120.000 96.000 120.000 C 100.418 120.000 104.000 116.418 104.000 112.000 L 104.000 108.000 C 104.000 97.000 114.770 88.000 128.000 88.000 C 141.230 88.000 152.000 97.000 152.000 108.000 C 152.000 119.000 141.230 128.000 128.000 128.000 C 123.582 128.000 120.000 131.582 120.000 136.000 L 120.000 144.000 C 120.000 148.418 123.582 152.000 128.000 152.000 C 132.418 152.000 136.000 148.418 136.000 144.000 L 136.000 143.280 C 154.240 139.930 168.000 125.380 168.000 108.000 C 168.000 88.150 150.060 72.000 128.000 72.000 ZM 232.000 128.000 C 232.000 185.438 185.438 232.000 128.000 232.000 C 70.562 232.000 24.000 185.438 24.000 128.000 C 24.000 70.562 70.562 24.000 128.000 24.000 C 185.412 24.061 231.939 70.588 232.000 128.000 ZM 216.000 128.000 C 216.000 79.399 176.601 40.000 128.000 40.000 C 79.399 40.000 40.000 79.399 40.000 128.000 C 40.000 176.601 79.399 216.000 128.000 216.000 C 176.578 215.945 215.945 176.578 216.000 128.000 Z"),
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
        return _question!!
    }

private var _question: ImageVector? = null
