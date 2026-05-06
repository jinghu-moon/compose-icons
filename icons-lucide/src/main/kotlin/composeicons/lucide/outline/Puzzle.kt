package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Puzzle: ImageVector
    get() {
        if (_puzzle != null) return _puzzle!!
        _puzzle = lucideOutlineIcon(
            name = "Puzzle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15.39 4.39c.256 .256 .63 .354 .979 .256 .349-.098 .617-.377 .701-.73 .287-1.196 1.401-2.005 2.627-1.908 1.226 .097 2.2 1.071 2.296 2.297 .096 1.226-.713 2.34-1.909 2.627-.352 .084-.631 .352-.73 .701-.098 .349-.001 .723 .256 .979l1.683 1.682c.453 .453 .707 1.067 .707 1.707 0 .64-.254 1.254-.707 1.707l-1.683 1.683c-.256 .256-.63 .354-.979 .256-.349-.098-.617-.377-.701-.73-.287-1.196-1.401-2.005-2.627-1.908-1.226 .097-2.2 1.071-2.296 2.297-.096 1.226 .713 2.34 1.909 2.627 .352 .084 .631 .352 .73 .701 .098 .349 .001 .723-.256 .979l-1.683 1.682c-.453 .453-1.067 .707-1.707 .707-.64 0-1.254-.254-1.707-.707L8.61 19.61c-.256-.256-.63-.354-.979-.256-.349 .098-.617 .377-.701 .73-.287 1.196-1.401 2.005-2.627 1.908C3.077 21.896 2.103 20.922 2.007 19.696c-.096-1.226 .713-2.34 1.909-2.627 .352-.084 .631-.352 .73-.701 .098-.349 .001-.723-.256-.979L2.707 13.707C2.254 13.254 2 12.64 2 12c0-.64 .254-1.254 .707-1.707L4.39 8.61c.256-.256 .63-.354 .979-.256 .349 .098 .617 .377 .701 .73 .287 1.196 1.401 2.005 2.627 1.908 1.226-.097 2.2-1.071 2.296-2.297C11.089 7.47 10.28 6.356 9.084 6.069 8.732 5.985 8.453 5.717 8.354 5.368c-.098-.349-.001-.723 .256-.979L10.293 2.707c.453-.453 1.067-.707 1.707-.707 .64 0 1.254 .254 1.707 .707Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _puzzle!!
    }

private var _puzzle: ImageVector? = null
