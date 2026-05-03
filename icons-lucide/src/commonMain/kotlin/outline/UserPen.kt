package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserPen: ImageVector
    get() {
        if (_userPen != null) return _userPen!!
        _userPen = lucideOutlineIcon(
            name = "UserPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.5f, 15.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.CurveTo(4.790861f, 15.0f, 3.0f, 16.790861f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.378f, 16.626f),
                    PathNode.CurveTo(22.20753f, 15.796469f, 22.20753f, 14.451531f, 21.378f, 13.622f),
                    PathNode.CurveTo(20.548468f, 12.792468f, 19.203531f, 12.792468f, 18.374f, 13.622f),
                    PathNode.LineTo(14.364f, 17.634f),
                    PathNode.CurveTo(14.126247f, 17.871622f, 13.952221f, 18.165335f, 13.858f, 18.488f),
                    PathNode.LineTo(13.021f, 21.358f),
                    PathNode.CurveTo(12.969881f, 21.533264f, 13.018352f, 21.722458f, 13.147447f, 21.851551f),
                    PathNode.CurveTo(13.276542f, 21.980648f, 13.465735f, 22.02912f, 13.641f, 21.978f),
                    PathNode.LineTo(16.511f, 21.141f),
                    PathNode.CurveTo(16.833666f, 21.04678f, 17.127378f, 20.872753f, 17.365f, 20.635f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.CurveTo(14.0f, 9.209139f, 12.209139f, 11.0f, 10.0f, 11.0f),
                    PathNode.CurveTo(7.790861f, 11.0f, 6.0f, 9.209139f, 6.0f, 7.0f),
                    PathNode.CurveTo(6.0f, 4.790861f, 7.790861f, 3.0f, 10.0f, 3.0f),
                    PathNode.CurveTo(12.209139f, 3.0f, 14.0f, 4.790861f, 14.0f, 7.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userPen!!
    }

private var _userPen: ImageVector? = null
