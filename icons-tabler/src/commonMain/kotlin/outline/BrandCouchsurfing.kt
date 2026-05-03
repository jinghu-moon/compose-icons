package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCouchsurfing: ImageVector
    get() {
        if (_brandCouchsurfing != null) return _brandCouchsurfing!!
        _brandCouchsurfing = tablerOutlineIcon(
            name = "BrandCouchsurfing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.1f, 13.0f),
                    PathNode.CurveTo(6.367f, 13.0f, 9.0f, 12.833f, 11.0f, 12.5f),
                    PathNode.CurveTo(14.0f, 12.0f, 15.0f, 10.5f, 15.0f, 9.0f),
                    PathNode.CurveTo(15.0f, 7.343146f, 13.656855f, 6.0f, 12.0f, 6.0f),
                    PathNode.CurveTo(10.343145f, 6.0f, 9.0f, 7.343146f, 9.0f, 9.0f),
                    PathNode.CurveTo(9.0f, 10.554f, 10.807f, 12.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(13.193f, 14.0f, 14.0f, 15.5f, 14.0f, 16.5f),
                    PathNode.CurveTo(14.0f, 17.328426f, 13.328427f, 18.0f, 12.5f, 18.0f),
                    PathNode.CurveTo(11.671573f, 18.0f, 11.0f, 17.328426f, 11.0f, 16.5f),
                    PathNode.CurveTo(11.0f, 14.5f, 15.0f, 13.0f, 18.0f, 13.0f),
                    PathNode.LineTo(20.9f, 13.0f)
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
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 16.970562f, 7.029437f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.970562f, 21.0f, 21.0f, 16.970562f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 7.029437f, 16.970562f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.029437f, 3.0f, 3.0f, 7.029437f, 3.0f, 12.0f)
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
        return _brandCouchsurfing!!
    }

private var _brandCouchsurfing: ImageVector? = null
