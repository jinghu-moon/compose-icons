package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandMixpanel: ImageVector
    get() {
        if (_brandMixpanel != null) return _brandMixpanel!!
        _brandMixpanel = tablerOutlineIcon(
            name = "BrandMixpanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 13.380712f, 3.119288f, 14.5f, 4.5f, 14.5f),
                    PathNode.CurveTo(5.880712f, 14.5f, 7.0f, 13.380712f, 7.0f, 12.0f),
                    PathNode.CurveTo(7.0f, 10.619288f, 5.880712f, 9.5f, 4.5f, 9.5f),
                    PathNode.CurveTo(3.119288f, 9.5f, 2.0f, 10.619288f, 2.0f, 12.0f)
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
                    PathNode.MoveTo(19.0f, 12.0f),
                    PathNode.CurveTo(19.0f, 12.828427f, 19.671574f, 13.5f, 20.5f, 13.5f),
                    PathNode.CurveTo(21.328426f, 13.5f, 22.0f, 12.828427f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 11.171573f, 21.328426f, 10.5f, 20.5f, 10.5f),
                    PathNode.CurveTo(19.671574f, 10.5f, 19.0f, 11.171573f, 19.0f, 12.0f)
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
                    PathNode.MoveTo(11.0f, 12.0f),
                    PathNode.CurveTo(11.0f, 13.104569f, 11.895431f, 14.0f, 13.0f, 14.0f),
                    PathNode.CurveTo(14.104569f, 14.0f, 15.0f, 13.104569f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.895431f, 14.104569f, 10.0f, 13.0f, 10.0f),
                    PathNode.CurveTo(11.895431f, 10.0f, 11.0f, 10.895431f, 11.0f, 12.0f)
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
        return _brandMixpanel!!
    }

private var _brandMixpanel: ImageVector? = null
