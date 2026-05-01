package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSnapchat: ImageVector
    get() {
        if (_brandSnapchat != null) return _brandSnapchat!!
        _brandSnapchat = tablerOutlineIcon(
            name = "BrandSnapchat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.882f, 7.842f),
                    PathNode.CurveTo(16.882f, 5.145746f, 14.696254f, 2.96f, 12.0f, 2.96f),
                    PathNode.CurveTo(9.303746f, 2.96f, 7.118f, 5.145746f, 7.118f, 7.842f),
                    PathNode.CurveTo(7.118f, 12.115f, 6.905f, 14.251f, 3.0f, 15.96f),
                    PathNode.CurveTo(5.0f, 16.842f, 5.0f, 16.842f, 6.0f, 18.96f),
                    PathNode.CurveTo(9.0f, 18.96f, 10.0f, 20.96f, 12.0f, 20.96f),
                    PathNode.CurveTo(14.0f, 20.96f, 15.0f, 18.96f, 18.0f, 18.96f),
                    PathNode.CurveTo(19.0f, 16.842f, 19.0f, 16.842f, 21.0f, 15.96f),
                    PathNode.CurveTo(17.094f, 14.251f, 16.882f, 12.115f, 16.882f, 7.842f),
                    PathNode.MoveTo(3.0f, 15.961f),
                    PathNode.CurveTo(7.0f, 13.843f, 7.0f, 11.843f, 4.0f, 8.843f),
                    PathNode.MoveTo(21.0f, 15.961f),
                    PathNode.CurveTo(17.0f, 13.843f, 17.0f, 11.843f, 20.0f, 8.843f)
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
        return _brandSnapchat!!
    }

private var _brandSnapchat: ImageVector? = null
