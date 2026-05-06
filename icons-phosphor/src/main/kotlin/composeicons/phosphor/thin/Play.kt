package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Play: ImageVector
    get() {
        if (_play != null) return _play!!
        _play = phosphorThinIcon(
            name = "Play",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.32 117.9 86.24 29.79C82.532 27.49 77.862 27.401 74.07 29.56 70.305 31.629 67.975 35.594 68 39.89v176.22c-.025 4.296 2.305 8.261 6.07 10.33 3.792 2.159 8.462 2.07 12.17-.23L230.32 138.1c3.527-2.144 5.68-5.973 5.68-10.1 0-4.127-2.153-7.956-5.68-10.1ZM226.14 131.27 82.06 219.39c-1.242 .764-2.802 .79-4.07 .07-1.238-.658-2.008-1.948-2-3.35v-176.22c-.008-1.402 .762-2.692 2-3.35 1.268-.72 2.828-.694 4.07 .07l144.08 88.12c1.156 .684 1.864 1.927 1.864 3.27 0 1.343-.709 2.586-1.864 3.27Z"),
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
        return _play!!
    }

private var _play: ImageVector? = null
