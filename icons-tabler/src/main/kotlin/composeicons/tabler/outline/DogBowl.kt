package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DogBowl: ImageVector
    get() {
        if (_dogBowl != null) return _dogBowl!!
        _dogBowl = tablerOutlineIcon(
            name = "DogBowl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 15.0f),
                    PathNode.LineTo(15.586f, 9.415f),
                    PathNode.CurveTo(14.945846f, 8.77504f, 14.815318f, 7.784909f, 15.267754f, 7.000913f),
                    PathNode.CurveTo(15.720188f, 6.216917f, 16.64278f, 5.834531f, 17.517172f, 6.068597f),
                    PathNode.CurveTo(18.391563f, 6.302663f, 18.99974f, 7.094823f, 19.0f, 8.0f),
                    PathNode.CurveTo(19.905426f, 7.999355f, 20.698345f, 8.607066f, 20.933058f, 9.48154f),
                    PathNode.CurveTo(21.16777f, 10.356014f, 20.785725f, 11.279093f, 20.001665f, 11.731913f),
                    PathNode.CurveTo(19.217606f, 12.184733f, 18.227137f, 12.054329f, 17.587f, 11.414f),
                    PathNode.LineTo(14.0f, 15.0f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(8.414f, 9.415f),
                    PathNode.CurveTo(9.054154f, 8.77504f, 9.184682f, 7.784909f, 8.732246f, 7.000913f),
                    PathNode.CurveTo(8.279812f, 6.216917f, 7.357219f, 5.834531f, 6.482828f, 6.068597f),
                    PathNode.CurveTo(5.608437f, 6.302663f, 5.00026f, 7.094823f, 5.0f, 8.0f),
                    PathNode.CurveTo(4.094575f, 7.999355f, 3.301655f, 8.607066f, 3.066942f, 9.48154f),
                    PathNode.CurveTo(2.832229f, 10.356014f, 3.214276f, 11.279093f, 3.998336f, 11.731913f),
                    PathNode.CurveTo(4.782395f, 12.184733f, 5.772864f, 12.054329f, 6.413f, 11.414f),
                    PathNode.LineTo(10.0f, 15.0f)
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
                    PathNode.MoveTo(3.0f, 20.0f),
                    PathNode.LineTo(21.0f, 20.0f),
                    PathNode.CurveTo(20.825f, 18.329f, 20.954f, 16.655f, 19.0f, 15.0f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.CurveTo(3.667f, 16.0f, 3.0f, 17.667f, 3.0f, 20.0f)
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
        return _dogBowl!!
    }

private var _dogBowl: ImageVector? = null
