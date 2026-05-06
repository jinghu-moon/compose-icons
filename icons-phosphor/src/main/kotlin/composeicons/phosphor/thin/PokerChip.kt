package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PokerChip: ImageVector
    get() {
        if (_pokerChip != null) return _pokerChip!!
        _pokerChip = phosphorThinIcon(
            name = "PokerChip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 180C99.281 180 76 156.719 76 128 76 99.281 99.281 76 128 76c28.719 0 52 23.281 52 52-.033 28.705-23.295 51.967-52 52ZM167.47 82.87C157.591 74.191 145.122 69.016 132 68.15v-32.06c21.616 .926 42.208 9.47 58.13 24.12ZM124 68.15c-13.122 .866-25.591 6.041-35.47 14.72L65.87 60.21C81.792 45.56 102.384 37.016 124 36.09ZM82.87 88.53C74.191 98.409 69.016 110.878 68.15 124h-32.06c.926-21.616 9.47-42.208 24.12-58.13ZM68.15 132c.866 13.122 6.041 25.591 14.72 35.47L60.21 190.13C45.56 174.208 37.016 153.616 36.09 132ZM88.53 173.13c9.879 8.679 22.348 13.854 35.47 14.72v32.06c-21.616-.926-42.208-9.47-58.13-24.12ZM132 187.85c13.122-.866 25.591-6.041 35.47-14.72l22.66 22.66C174.208 210.44 153.616 218.984 132 219.91ZM173.13 167.47c8.679-9.879 13.854-22.348 14.72-35.47h32.06c-.926 21.616-9.47 42.208-24.12 58.13ZM187.85 124c-.866-13.122-6.041-25.591-14.72-35.47L195.79 65.87c14.65 15.922 23.194 36.514 24.12 58.13Z"),
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
        return _pokerChip!!
    }

private var _pokerChip: ImageVector? = null
