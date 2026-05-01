package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = tablerFilledIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 4.0f),
                    PathNode.CurveTo(18.304985f, 4.000005f, 18.593298f, 4.13919f, 18.783f, 4.378f),
                    PathNode.LineTo(18.857f, 4.486f),
                    PathNode.LineTo(21.857f, 9.486f),
                    PathNode.CurveTo(22.057617f, 9.820788f, 22.045122f, 10.241701f, 21.825f, 10.564f),
                    PathNode.LineTo(21.745f, 10.667f),
                    PathNode.LineTo(13.215f, 20.2f),
                    PathNode.CurveTo(12.895034f, 20.52643f, 12.457094f, 20.710257f, 12.0f, 20.71f),
                    PathNode.CurveTo(11.6f, 20.71f, 11.215f, 20.57f, 10.89f, 20.293f),
                    PathNode.LineTo(10.755f, 20.167f),
                    PathNode.LineTo(2.255f, 10.667f),
                    PathNode.CurveTo(1.993854f, 10.375614f, 1.926646f, 9.958687f, 2.083f, 9.6f),
                    PathNode.LineTo(2.143f, 9.485f),
                    PathNode.LineTo(5.156f, 4.463f),
                    PathNode.LineTo(5.22f, 4.373f),
                    PathNode.CurveTo(5.265777f, 4.316061f, 5.317766f, 4.264408f, 5.375f, 4.219f),
                    PathNode.LineTo(5.464f, 4.155f),
                    PathNode.LineTo(5.552f, 4.105f),
                    PathNode.LineTo(5.602f, 4.082f),
                    PathNode.LineTo(5.662f, 4.057f),
                    PathNode.LineTo(5.771f, 4.025f),
                    PathNode.LineTo(5.883f, 4.005f),
                    PathNode.LineTo(6.0f, 4.0f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(9.114f, 7.943f),
                    PathNode.CurveTo(8.640633f, 7.659526f, 8.027115f, 7.813017f, 7.743f, 8.286001f),
                    PathNode.LineTo(7.143f, 9.286f),
                    PathNode.LineTo(7.083f, 9.402f),
                    PathNode.CurveTo(6.926672f, 9.762467f, 6.995919f, 10.181077f, 7.26f, 10.472f),
                    PathNode.LineTo(9.26f, 12.672f),
                    PathNode.LineTo(9.35f, 12.76f),
                    PathNode.CurveTo(9.733006f, 13.087744f, 10.300076f, 13.079171f, 10.673f, 12.74f),
                    PathNode.LineTo(10.76f, 12.65f),
                    PathNode.CurveTo(11.087744f, 12.266994f, 11.079171f, 11.699924f, 10.74f, 11.327f),
                    PathNode.LineTo(9.239f, 9.677f),
                    PathNode.LineTo(9.457f, 9.314f),
                    PathNode.LineTo(9.512f, 9.211f),
                    PathNode.CurveTo(9.720002f, 8.748557f, 9.548961f, 8.20363f, 9.114f, 7.943f),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
