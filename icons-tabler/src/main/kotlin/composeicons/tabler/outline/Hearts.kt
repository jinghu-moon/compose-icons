package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hearts: ImageVector
    get() {
        if (_hearts != null) return _hearts!!
        _hearts = tablerOutlineIcon(
            name = "Hearts",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.017f, 18.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.LineTo(4.5f, 12.572f),
                    PathNode.CurveTo(3.151298f, 11.259582f, 2.65373f, 9.301041f, 3.21248f, 7.504033f),
                    PathNode.CurveTo(3.771231f, 5.707025f, 5.291653f, 4.375945f, 7.146762f, 4.0597f),
                    PathNode.CurveTo(9.001871f, 3.743454f, 10.877429f, 4.495612f, 12.0f, 6.006f),
                    PathNode.CurveTo(13.626646f, 3.840396f, 16.68187f, 3.363718f, 18.890903f, 4.930877f),
                    PathNode.CurveTo(21.099937f, 6.498037f, 21.659513f, 9.53917f, 20.153f, 11.79f)
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
                    PathNode.MoveTo(15.99f, 20.0f),
                    PathNode.LineTo(20.187f, 15.777f),
                    PathNode.CurveTo(21.267193f, 14.682659f, 21.267193f, 12.923341f, 20.187f, 11.829f),
                    PathNode.CurveTo(19.671785f, 11.305174f, 18.968199f, 11.009576f, 18.233463f, 11.008261f),
                    PathNode.CurveTo(17.498728f, 11.006946f, 16.794086f, 11.300022f, 16.277f, 11.822f),
                    PathNode.LineTo(15.997f, 12.104f),
                    PathNode.LineTo(15.718f, 11.821f),
                    PathNode.CurveTo(15.202786f, 11.297174f, 14.499199f, 11.001576f, 13.764463f, 11.00026f),
                    PathNode.CurveTo(13.029727f, 10.998945f, 12.325086f, 11.292023f, 11.808f, 11.814f),
                    PathNode.CurveTo(10.725865f, 12.906425f, 10.722746f, 14.665745f, 11.801f, 15.762f),
                    PathNode.LineTo(15.983f, 20.0f),
                    PathNode.LineTo(15.99f, 20.0f)
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
        return _hearts!!
    }

private var _hearts: ImageVector? = null
