package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MichelinStar: ImageVector
    get() {
        if (_michelinStar != null) return _michelinStar!!
        _michelinStar = tablerFilledIcon(
            name = "MichelinStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.81f, 2.0f),
                    PathNode.CurveTo(13.828f, 2.0f, 15.288f, 3.232f, 15.684f, 5.129f),
                    PathNode.LineTo(15.7f, 5.218f),
                    PathNode.LineTo(15.872f, 5.161f),
                    PathNode.CurveTo(16.212f, 5.057f, 16.556f, 5.001f, 16.927f, 4.986f),
                    PathNode.LineTo(17.154f, 4.981f),
                    PathNode.CurveTo(19.244f, 4.981f, 21.079f, 6.911f, 21.079f, 9.075f),
                    PathNode.CurveTo(21.079f, 10.17f, 20.569f, 11.162f, 19.715f, 11.91f),
                    PathNode.LineTo(19.597f, 12.008f),
                    PathNode.LineTo(19.657f, 12.056f),
                    PathNode.CurveTo(20.537f, 12.793f, 21.017f, 13.661f, 21.073f, 14.712f),
                    PathNode.LineTo(21.079f, 14.925f),
                    PathNode.CurveTo(21.079f, 17.165f, 19.34f, 19.019f, 17.154f, 19.019f),
                    PathNode.CurveTo(16.709f, 19.019f, 16.231f, 18.935f, 15.78f, 18.786f),
                    PathNode.LineTo(15.737f, 18.979f),
                    PathNode.CurveTo(15.342f, 20.715f, 13.931f, 21.912f, 12.075f, 21.995f),
                    PathNode.LineTo(11.867f, 22.0f),
                    PathNode.CurveTo(9.849f, 22.0f, 8.39f, 20.768f, 7.994f, 18.87f),
                    PathNode.LineTo(7.964f, 18.709f),
                    PathNode.LineTo(7.953f, 18.715f),
                    PathNode.CurveTo(7.548358f, 18.861631f, 7.123151f, 18.943636f, 6.693f, 18.958f),
                    PathNode.LineTo(6.467f, 18.963f),
                    PathNode.CurveTo(4.377f, 18.963f, 2.542f, 17.033f, 2.542f, 14.869f),
                    PathNode.CurveTo(2.542f, 13.773f, 3.052f, 12.782f, 3.92f, 12.029f),
                    PathNode.LineTo(3.993f, 11.967f),
                    PathNode.LineTo(3.963f, 11.944f),
                    PathNode.CurveTo(3.083f, 11.207f, 2.604f, 10.339f, 2.548f, 9.288f),
                    PathNode.LineTo(2.542f, 9.075f),
                    PathNode.CurveTo(2.542f, 6.836f, 4.282f, 4.981f, 6.467f, 4.981f),
                    PathNode.CurveTo(6.907f, 4.981f, 7.387f, 5.079f, 7.858f, 5.251f),
                    PathNode.LineTo(7.894f, 5.264f),
                    PathNode.LineTo(7.902f, 5.216f),
                    PathNode.CurveTo(8.233f, 3.376f, 9.678f, 2.091f, 11.602f, 2.005f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _michelinStar!!
    }

private var _michelinStar: ImageVector? = null
