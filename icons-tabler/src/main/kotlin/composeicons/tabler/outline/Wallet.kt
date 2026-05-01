package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wallet: ImageVector
    get() {
        if (_wallet != null) return _wallet!!
        _wallet = tablerOutlineIcon(
            name = "Wallet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 8.0f),
                    PathNode.LineTo(17.0f, 5.0f),
                    PathNode.CurveTo(17.0f, 4.447716f, 16.552284f, 4.0f, 16.0f, 4.0f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.CurveTo(4.895431f, 4.0f, 4.0f, 4.895431f, 4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 7.10457f, 4.895431f, 8.0f, 6.0f, 8.0f),
                    PathNode.LineTo(18.0f, 8.0f),
                    PathNode.CurveTo(18.552284f, 8.0f, 19.0f, 8.447715f, 19.0f, 9.0f),
                    PathNode.LineTo(19.0f, 12.0f),
                    PathNode.MoveTo(19.0f, 16.0f),
                    PathNode.LineTo(19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 19.552284f, 18.552284f, 20.0f, 18.0f, 20.0f),
                    PathNode.LineTo(6.0f, 20.0f),
                    PathNode.CurveTo(4.895431f, 20.0f, 4.0f, 19.10457f, 4.0f, 18.0f),
                    PathNode.LineTo(4.0f, 6.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.CurveTo(14.895431f, 16.0f, 14.0f, 15.104569f, 14.0f, 14.0f),
                    PathNode.CurveTo(14.0f, 12.895431f, 14.895431f, 12.0f, 16.0f, 12.0f),
                    PathNode.LineTo(20.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wallet!!
    }

private var _wallet: ImageVector? = null
