package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = tablerOutlineIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 18.176f),
                    PathNode.CurveTo(11.919905f, 19.537207f, 10.931898f, 20.67318f, 9.594944f, 20.941238f),
                    PathNode.CurveTo(8.257991f, 21.2093f, 6.908429f, 20.542011f, 6.309775f, 19.316895f),
                    PathNode.CurveTo(5.711119f, 18.091776f, 6.013975f, 16.617033f, 7.047f, 15.727f),
                    PathNode.LineTo(7.022f, 15.75f),
                    PathNode.CurveTo(4.952587f, 15.023765f, 3.707606f, 12.912006f, 4.074086f, 10.749697f),
                    PathNode.CurveTo(4.440567f, 8.587388f, 6.311858f, 7.003793f, 8.505f, 7.0f),
                    PathNode.CurveTo(9.919f, 7.0f, 11.18f, 7.652f, 12.005f, 8.671f),
                    PathNode.CurveTo(13.205733f, 7.187539f, 15.211635f, 6.622852f, 17.009924f, 7.262048f),
                    PathNode.CurveTo(18.808214f, 7.901243f, 20.007706f, 9.605277f, 20.002775f, 11.513783f),
                    PathNode.CurveTo(19.997847f, 13.422288f, 18.789568f, 15.120102f, 16.988f, 15.75f),
                    PathNode.CurveTo(18.02467f, 16.663181f, 18.303686f, 18.166252f, 17.663816f, 19.390652f),
                    PathNode.CurveTo(17.023949f, 20.61505f, 15.630651f, 21.244173f, 14.289054f, 20.914474f),
                    PathNode.CurveTo(12.947456f, 20.584778f, 12.004467f, 19.381516f, 12.005f, 18.0f),
                    PathNode.LineTo(12.0f, 18.176f)
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
                    PathNode.MoveTo(12.0f, 19.0f),
                    PathNode.LineTo(12.0f, 9.0f)
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
                    PathNode.MoveTo(9.0f, 3.0f),
                    PathNode.LineTo(12.0f, 5.0f),
                    PathNode.LineTo(15.0f, 3.0f)
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
