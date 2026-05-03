package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Component: ImageVector
    get() {
        if (_component != null) return _component!!
        _component = lucideOutlineIcon(
            name = "Component",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.536 11.293 C 15.146 11.684 15.146 12.316 15.536 12.707 L 17.912 15.084 C 18.302 15.474 18.936 15.474 19.326 15.084 L 21.703 12.707 C 22.093 12.316 22.093 11.684 21.703 11.293 L 19.326 8.916 C 18.936 8.526 18.302 8.526 17.912 8.916 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 2.297 11.293 C 1.907 11.684 1.907 12.316 2.297 12.707 L 4.674 15.084 C 5.064 15.474 5.698 15.474 6.088 15.084 L 8.465 12.707 C 8.855 12.316 8.855 11.684 8.465 11.293 L 6.088 8.916 C 5.698 8.526 5.064 8.526 4.674 8.916 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 8.916 17.912 C 8.728 18.100 8.623 18.354 8.623 18.619 C 8.623 18.885 8.728 19.139 8.916 19.327 L 11.293 21.703 C 11.684 22.093 12.316 22.093 12.707 21.703 L 15.084 19.327 C 15.272 19.139 15.377 18.885 15.377 18.619 C 15.377 18.354 15.272 18.100 15.084 17.912 L 12.707 15.536 C 12.316 15.146 11.684 15.146 11.293 15.536 Z"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 8.916 4.674 C 8.526 5.064 8.526 5.698 8.916 6.088 L 11.293 8.464 C 11.684 8.854 12.316 8.854 12.707 8.464 L 15.084 6.088 C 15.474 5.698 15.474 5.064 15.084 4.674 L 12.707 2.297 C 12.316 1.907 11.684 1.907 11.293 2.297 Z"),
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
        return _component!!
    }

private var _component: ImageVector? = null
