package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Package: ImageVector
    get() {
        if (_package != null) return _package!!
        _package = phosphorThinIcon(
            name = "Package",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.76 69.66l-88-48.18c-3.589-1.964-7.931-1.964-11.52 0L34.24 69.66C30.395 71.764 28.003 75.797 28 80.18v95.64c.003 4.383 2.395 8.416 6.24 10.52l88 48.18c3.587 1.973 7.933 1.973 11.52 0l88-48.18c3.845-2.104 6.237-6.137 6.24-10.52v-95.64c-.003-4.383-2.395-8.416-6.24-10.52ZM126.08 28.5c1.193-.666 2.647-.666 3.84 0L216.67 76 178.5 96.89c-.181-.15-.375-.284-.58-.4l-88-48.18ZM128 124.5 39.33 76 81.56 52.87l88.67 48.54ZM38.08 179.3c-1.28-.7-2.077-2.041-2.08-3.5v-92.51l88 48.16v94.91ZM217.92 179.3h0l-85.92 47v-94.85l40-21.89v42.44c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-46.82L220 83.29v92.53c-.003 1.459-.8 2.8-2.08 3.5Z"),
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
        return _package!!
    }

private var _package: ImageVector? = null
