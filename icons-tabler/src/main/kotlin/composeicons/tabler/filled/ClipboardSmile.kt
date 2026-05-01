package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ClipboardSmile: ImageVector
    get() {
        if (_clipboardSmile != null) return _clipboardSmile!!
        _clipboardSmile = tablerFilledIcon(
            name = "ClipboardSmile",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.997f, 4.17f),
                    PathNode.CurveTo(19.197367f, 4.592963f, 20.000217f, 5.727295f, 20.0f, 7.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.656855f, 18.656855f, 22.0f, 17.0f, 22.0f),
                    PathNode.LineTo(7.0f, 22.0f),
                    PathNode.CurveTo(5.343146f, 22.0f, 4.0f, 20.656855f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 7.0f),
                    PathNode.CurveTo(3.999782f, 5.727295f, 4.802633f, 4.592963f, 6.003f, 4.17f),
                    PathNode.CurveTo(6.094089f, 6.31132f, 7.856744f, 8.000329f, 10.0f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(16.053223f, 8.000181f, 17.773138f, 6.445776f, 17.98f, 4.403f),
                    PathNode.Close,
                    PathNode.MoveTo(14.821f, 15.429f),
                    PathNode.CurveTo(14.669568f, 15.211248f, 14.437834f, 15.062575f, 14.17678f, 15.015691f),
                    PathNode.CurveTo(13.915726f, 14.968806f, 13.646739f, 15.027551f, 13.429f, 15.179f),
                    PathNode.CurveTo(12.570247f, 15.777225f, 11.429753f, 15.777225f, 10.571f, 15.179f),
                    PathNode.CurveTo(10.117575f, 14.863646f, 9.494354f, 14.975574f, 9.179f, 15.429f),
                    PathNode.CurveTo(8.863646f, 15.882425f, 8.975574f, 16.505646f, 9.429f, 16.821f),
                    PathNode.CurveTo(10.974226f, 17.89669f, 13.025774f, 17.89669f, 14.571f, 16.821f),
                    PathNode.CurveTo(14.788752f, 16.669569f, 14.937425f, 16.437834f, 14.984309f, 16.176779f),
                    PathNode.CurveTo(15.031194f, 15.915726f, 14.972449f, 15.646739f, 14.821f, 15.429f),
                    PathNode.MoveTo(10.01f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.CurveTo(9.470906f, 12.000587f, 9.033835f, 12.413211f, 9.002828f, 12.941395f),
                    PathNode.CurveTo(8.971821f, 13.469579f, 9.35761f, 13.93051f, 9.883f, 13.993f),
                    PathNode.LineTo(10.01f, 14.0f),
                    PathNode.CurveTo(10.562284f, 14.0f, 11.01f, 13.552285f, 11.01f, 13.0f),
                    PathNode.CurveTo(11.01f, 12.447715f, 10.562284f, 12.0f, 10.01f, 12.0f),
                    PathNode.MoveTo(14.01f, 12.0f),
                    PathNode.LineTo(14.0f, 12.0f),
                    PathNode.CurveTo(13.470906f, 12.000587f, 13.033835f, 12.413211f, 13.002828f, 12.941395f),
                    PathNode.CurveTo(12.971821f, 13.469579f, 13.35761f, 13.93051f, 13.883f, 13.993f),
                    PathNode.LineTo(14.01f, 14.0f),
                    PathNode.CurveTo(14.562284f, 14.0f, 15.01f, 13.552285f, 15.01f, 13.0f),
                    PathNode.CurveTo(15.01f, 12.447715f, 14.562284f, 12.0f, 14.01f, 12.0f),
                    PathNode.MoveTo(14.0f, 2.0f),
                    PathNode.CurveTo(15.104569f, 2.0f, 16.0f, 2.895431f, 16.0f, 4.0f),
                    PathNode.CurveTo(16.0f, 5.10457f, 15.104569f, 6.0f, 14.0f, 6.0f),
                    PathNode.LineTo(10.0f, 6.0f),
                    PathNode.CurveTo(8.895431f, 6.0f, 8.0f, 5.10457f, 8.0f, 4.0f),
                    PathNode.CurveTo(8.0f, 2.895431f, 8.895431f, 2.0f, 10.0f, 2.0f),
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
        return _clipboardSmile!!
    }

private var _clipboardSmile: ImageVector? = null
