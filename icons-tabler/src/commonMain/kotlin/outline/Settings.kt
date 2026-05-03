package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Settings: ImageVector
    get() {
        if (_settings != null) return _settings!!
        _settings = tablerOutlineIcon(
            name = "Settings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.325f, 4.317f),
                    PathNode.CurveTo(10.751f, 2.561f, 13.249f, 2.561f, 13.675f, 4.317f),
                    PathNode.CurveTo(13.804643f, 4.85206f, 14.182034f, 5.293024f, 14.690652f, 5.503746f),
                    PathNode.CurveTo(15.199269f, 5.714468f, 15.777941f, 5.669602f, 16.248f, 5.383f),
                    PathNode.CurveTo(17.791f, 4.443f, 19.558f, 6.209f, 18.618f, 7.753f),
                    PathNode.CurveTo(18.331812f, 8.222854f, 18.287054f, 8.801081f, 18.497528f, 9.30938f),
                    PathNode.CurveTo(18.708002f, 9.817677f, 19.148428f, 10.195002f, 19.683f, 10.325f),
                    PathNode.CurveTo(21.439f, 10.751f, 21.439f, 13.249f, 19.683f, 13.675f),
                    PathNode.CurveTo(19.147942f, 13.804643f, 18.706976f, 14.182034f, 18.496254f, 14.690652f),
                    PathNode.CurveTo(18.285532f, 15.199269f, 18.330399f, 15.777941f, 18.617f, 16.248f),
                    PathNode.CurveTo(19.557f, 17.791f, 17.791f, 19.558f, 16.247f, 18.618f),
                    PathNode.CurveTo(15.777146f, 18.331812f, 15.198919f, 18.287054f, 14.69062f, 18.497528f),
                    PathNode.CurveTo(14.182323f, 18.708002f, 13.804998f, 19.148428f, 13.675f, 19.683f),
                    PathNode.CurveTo(13.249f, 21.439f, 10.751f, 21.439f, 10.325f, 19.683f),
                    PathNode.CurveTo(10.195357f, 19.147942f, 9.817966f, 18.706976f, 9.309348f, 18.496254f),
                    PathNode.CurveTo(8.800731f, 18.285532f, 8.222059f, 18.330399f, 7.752f, 18.617f),
                    PathNode.CurveTo(6.209f, 19.557f, 4.442f, 17.791f, 5.382f, 16.247f),
                    PathNode.CurveTo(5.668188f, 15.777146f, 5.712946f, 15.198919f, 5.502472f, 14.69062f),
                    PathNode.CurveTo(5.291999f, 14.182323f, 4.851571f, 13.804998f, 4.317f, 13.675f),
                    PathNode.CurveTo(2.561f, 13.249f, 2.561f, 10.751f, 4.317f, 10.325f),
                    PathNode.CurveTo(4.85206f, 10.195357f, 5.293024f, 9.817966f, 5.503746f, 9.309348f),
                    PathNode.CurveTo(5.714468f, 8.800731f, 5.669602f, 8.222059f, 5.383f, 7.752f),
                    PathNode.CurveTo(4.443f, 6.209f, 6.209f, 4.442f, 7.753f, 5.382f),
                    PathNode.CurveTo(8.753f, 5.99f, 10.049f, 5.452f, 10.325f, 4.317f)
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
                    PathNode.MoveTo(9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 13.656855f, 10.343145f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.656855f, 15.0f, 15.0f, 13.656855f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 10.343145f, 13.656855f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(10.343145f, 9.0f, 9.0f, 10.343145f, 9.0f, 12.0f)
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
        return _settings!!
    }

private var _settings: ImageVector? = null
