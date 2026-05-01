package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Rocket: ImageVector
    get() {
        if (_rocket != null) return _rocket!!
        _rocket = tablerOutlineIcon(
            name = "Rocket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 13.0f),
                    PathNode.CurveTo(7.670194f, 13.436175f, 10.563825f, 16.329805f, 11.0f, 20.0f),
                    PathNode.CurveTo(12.797071f, 18.963968f, 13.931534f, 17.073195f, 14.0f, 15.0f),
                    PathNode.CurveTo(17.433771f, 13.79205f, 19.801825f, 10.634645f, 20.0f, 7.0f),
                    PathNode.CurveTo(20.0f, 5.343146f, 18.656855f, 4.0f, 17.0f, 4.0f),
                    PathNode.CurveTo(13.365355f, 4.198176f, 10.20795f, 6.56623f, 9.0f, 10.0f),
                    PathNode.CurveTo(6.926805f, 10.068466f, 5.036033f, 11.202929f, 4.0f, 13.0f)
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
                    PathNode.MoveTo(7.0f, 14.0f),
                    PathNode.CurveTo(4.870942f, 15.20197f, 3.684141f, 17.575571f, 4.0f, 20.0f),
                    PathNode.CurveTo(6.424429f, 20.315859f, 8.79803f, 19.129059f, 10.0f, 17.0f)
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
                    PathNode.MoveTo(14.0f, 9.0f),
                    PathNode.CurveTo(14.0f, 9.552285f, 14.447715f, 10.0f, 15.0f, 10.0f),
                    PathNode.CurveTo(15.552285f, 10.0f, 16.0f, 9.552285f, 16.0f, 9.0f),
                    PathNode.CurveTo(16.0f, 8.447715f, 15.552285f, 8.0f, 15.0f, 8.0f),
                    PathNode.CurveTo(14.447715f, 8.0f, 14.0f, 8.447715f, 14.0f, 9.0f)
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
        return _rocket!!
    }

private var _rocket: ImageVector? = null
