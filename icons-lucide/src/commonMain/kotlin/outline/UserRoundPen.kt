package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.UserRoundPen: ImageVector
    get() {
        if (_userRoundPen != null) return _userRoundPen!!
        _userRoundPen = lucideOutlineIcon(
            name = "UserRoundPen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 21.0f),
                    PathNode.CurveTo(1.99971f, 18.373741f, 3.288447f, 15.914602f, 5.448154f, 14.420311f),
                    PathNode.CurveTo(7.607861f, 12.92602f, 10.363439f, 12.586915f, 12.821f, 13.513f)
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
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.CurveTo(15.0f, 10.761424f, 12.761424f, 13.0f, 10.0f, 13.0f),
                    PathNode.CurveTo(7.238577f, 13.0f, 5.0f, 10.761424f, 5.0f, 8.0f),
                    PathNode.CurveTo(5.0f, 5.238577f, 7.238577f, 3.0f, 10.0f, 3.0f),
                    PathNode.CurveTo(12.761424f, 3.0f, 15.0f, 5.238577f, 15.0f, 8.0f),
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
        return _userRoundPen!!
    }

private var _userRoundPen: ImageVector? = null
