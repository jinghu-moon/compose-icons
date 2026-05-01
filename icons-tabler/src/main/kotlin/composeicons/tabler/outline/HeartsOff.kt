package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeartsOff: ImageVector
    get() {
        if (_heartsOff != null) return _heartsOff!!
        _heartsOff = tablerOutlineIcon(
            name = "HeartsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.017f, 18.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.LineTo(4.5f, 12.572f),
                    PathNode.CurveTo(3.452078f, 11.552384f, 2.902955f, 10.125172f, 2.9972f, 8.666105f),
                    PathNode.CurveTo(3.091445f, 7.207039f, 3.819614f, 5.862329f, 4.99f, 4.986f),
                    PathNode.MoveTo(8.0f, 3.986f),
                    PathNode.CurveTo(9.576961f, 3.990242f, 11.059504f, 4.738185f, 12.0f, 6.004f),
                    PathNode.CurveTo(13.626646f, 3.838396f, 16.68187f, 3.361718f, 18.890903f, 4.928878f),
                    PathNode.CurveTo(21.099937f, 6.496037f, 21.659513f, 9.53717f, 20.153f, 11.788f)
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
                    PathNode.MoveTo(11.814f, 11.814f),
                    PathNode.CurveTo(10.731865f, 12.906425f, 10.728745f, 14.665745f, 11.807f, 15.762f),
                    PathNode.LineTo(15.989f, 20.0f),
                    PathNode.LineTo(17.999f, 17.979f),
                    PathNode.MoveTo(19.976f, 15.989f),
                    PathNode.LineTo(20.187f, 15.777f),
                    PathNode.CurveTo(21.267193f, 14.682659f, 21.267193f, 12.923341f, 20.187f, 11.829f),
                    PathNode.CurveTo(19.671785f, 11.305174f, 18.968199f, 11.009576f, 18.233463f, 11.008261f),
                    PathNode.CurveTo(17.498728f, 11.006946f, 16.794086f, 11.300022f, 16.277f, 11.822f),
                    PathNode.LineTo(15.994f, 12.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _heartsOff!!
    }

private var _heartsOff: ImageVector? = null
