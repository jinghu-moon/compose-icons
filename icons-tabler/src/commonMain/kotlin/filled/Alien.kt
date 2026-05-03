package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = tablerFilledIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.004f, 2.0f),
                    PathNode.CurveTo(16.946f, 2.0f, 20.292f, 4.503f, 20.854f, 8.444f),
                    PathNode.CurveTo(21.352814f, 11.709224f, 20.578503f, 15.04131f, 18.691f, 17.752f),
                    PathNode.CurveTo(17.766468f, 19.10204f, 16.571133f, 20.244928f, 15.181f, 21.108f),
                    PathNode.CurveTo(13.199f, 22.298f, 10.805f, 22.298f, 8.808f, 21.1f),
                    PathNode.CurveTo(7.426488f, 20.239992f, 6.238447f, 19.102686f, 5.319f, 17.76f),
                    PathNode.CurveTo(3.42192f, 15.05422f, 2.644058f, 11.719914f, 3.148f, 8.454f),
                    PathNode.CurveTo(3.712f, 4.504f, 7.058f, 2.0f, 12.004f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.917f, 16.6f),
                    PathNode.CurveTo(13.811007f, 16.356716f, 13.61266f, 16.165539f, 13.365642f, 16.06857f),
                    PathNode.CurveTo(13.118623f, 15.9716f, 12.843189f, 15.97679f, 12.6f, 16.083f),
                    PathNode.LineTo(12.454f, 16.138f),
                    PathNode.CurveTo(12.107605f, 16.247957f, 11.733069f, 16.228413f, 11.4f, 16.083f),
                    PathNode.LineTo(11.29f, 16.043f),
                    PathNode.CurveTo(10.782411f, 15.887131f, 10.241504f, 16.155144f, 10.058039f, 16.653423f),
                    PathNode.CurveTo(9.874574f, 17.151705f, 10.112528f, 17.706491f, 10.6f, 17.917f),
                    PathNode.CurveTo(11.492677f, 18.306597f, 12.507323f, 18.306597f, 13.4f, 17.917f),
                    PathNode.CurveTo(13.643284f, 17.811007f, 13.834461f, 17.612661f, 13.931431f, 17.36564f),
                    PathNode.CurveTo(14.0284f, 17.118622f, 14.02321f, 16.84319f, 13.917f, 16.6f),
                    PathNode.Close,
                    PathNode.MoveTo(8.613f, 10.21f),
                    PathNode.CurveTo(8.195871f, 9.887465f, 7.599979f, 9.94423f, 7.251249f, 10.339722f),
                    PathNode.CurveTo(6.902519f, 10.735212f, 6.920789f, 11.333524f, 7.293f, 11.707f),
                    PathNode.LineTo(9.293f, 13.707f),
                    PathNode.LineTo(9.387f, 13.79f),
                    PathNode.CurveTo(9.80413f, 14.112535f, 10.400022f, 14.05577f, 10.748752f, 13.660278f),
                    PathNode.CurveTo(11.097481f, 13.264788f, 11.07921f, 12.666476f, 10.707f, 12.293f),
                    PathNode.LineTo(8.707f, 10.293f),
                    PathNode.Close,
                    PathNode.MoveTo(16.707f, 10.293f),
                    PathNode.CurveTo(16.3165f, 9.902618f, 15.6835f, 9.902618f, 15.293f, 10.293f),
                    PathNode.LineTo(13.293f, 12.293f),
                    PathNode.LineTo(13.21f, 12.387f),
                    PathNode.CurveTo(12.887465f, 12.80413f, 12.94423f, 13.400022f, 13.339722f, 13.748752f),
                    PathNode.CurveTo(13.735212f, 14.097481f, 14.333524f, 14.07921f, 14.707f, 13.707f),
                    PathNode.LineTo(16.707f, 11.707f),
                    PathNode.LineTo(16.79f, 11.613f),
                    PathNode.CurveTo(17.098803f, 11.214914f, 17.063234f, 10.649268f, 16.707f, 10.293f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _alien!!
    }

private var _alien: ImageVector? = null
