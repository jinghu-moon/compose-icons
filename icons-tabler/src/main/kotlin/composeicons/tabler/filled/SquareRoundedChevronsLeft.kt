package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedChevronsLeft: ImageVector
    get() {
        if (_squareRoundedChevronsLeft != null) return _squareRoundedChevronsLeft!!
        _squareRoundedChevronsLeft = tablerFilledIcon(
            name = "SquareRoundedChevronsLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(11.782f, 2.0f, 11.568f, 2.002f, 11.358f, 2.005f),
                    PathNode.LineTo(10.742f, 2.022f),
                    PathNode.LineTo(10.443f, 2.035f),
                    PathNode.LineTo(9.864f, 2.069f),
                    PathNode.LineTo(9.311f, 2.115f),
                    PathNode.CurveTo(4.526f, 2.579f, 2.579f, 4.526f, 2.115f, 9.311f),
                    PathNode.LineTo(2.069f, 9.864f),
                    PathNode.LineTo(2.035f, 10.443f),
                    PathNode.CurveTo(2.03f, 10.541f, 2.025f, 10.641f, 2.022f, 10.742f),
                    PathNode.LineTo(2.005f, 11.358f),
                    PathNode.LineTo(2.001f, 11.676f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 12.218f, 2.002f, 12.432f, 2.005f, 12.642f),
                    PathNode.LineTo(2.022f, 13.258f),
                    PathNode.LineTo(2.035f, 13.557f),
                    PathNode.LineTo(2.069f, 14.136f),
                    PathNode.LineTo(2.115f, 14.689f),
                    PathNode.CurveTo(2.579f, 19.474f, 4.526f, 21.421f, 9.311f, 21.885f),
                    PathNode.LineTo(9.864f, 21.931f),
                    PathNode.LineTo(10.443f, 21.965f),
                    PathNode.CurveTo(10.541f, 21.97f, 10.641f, 21.975f, 10.742f, 21.978f),
                    PathNode.LineTo(11.358f, 21.995f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(12.642f, 21.995f),
                    PathNode.LineTo(13.258f, 21.978f),
                    PathNode.LineTo(13.557f, 21.965f),
                    PathNode.LineTo(14.136f, 21.931f),
                    PathNode.LineTo(14.689f, 21.885f),
                    PathNode.CurveTo(19.474f, 21.421f, 21.421f, 19.474f, 21.885f, 14.689f),
                    PathNode.LineTo(21.931f, 14.136f),
                    PathNode.LineTo(21.965f, 13.557f),
                    PathNode.CurveTo(21.97f, 13.459f, 21.975f, 13.359f, 21.978f, 13.258f),
                    PathNode.LineTo(21.995f, 12.642f),
                    PathNode.LineTo(22.0f, 12.0f),
                    PathNode.LineTo(21.995f, 11.358f),
                    PathNode.LineTo(21.978f, 10.742f),
                    PathNode.LineTo(21.965f, 10.443f),
                    PathNode.LineTo(21.931f, 9.864f),
                    PathNode.LineTo(21.885f, 9.311f),
                    PathNode.CurveTo(21.421f, 4.526f, 19.474f, 2.579f, 14.689f, 2.115f),
                    PathNode.LineTo(14.136f, 2.069f),
                    PathNode.LineTo(13.557f, 2.035f),
                    PathNode.CurveTo(13.457357f, 2.030135f, 13.357689f, 2.025802f, 13.258f, 2.022f),
                    PathNode.LineTo(12.642f, 2.005f),
                    PathNode.LineTo(12.324f, 2.001f),
                    PathNode.LineTo(12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(14.293f, 8.293f),
                    PathNode.CurveTo(14.666476f, 7.920789f, 15.264788f, 7.902519f, 15.660278f, 8.251249f),
                    PathNode.CurveTo(16.055769f, 8.599978f, 16.112535f, 9.19587f, 15.79f, 9.613f),
                    PathNode.LineTo(15.707f, 9.707f),
                    PathNode.LineTo(13.415f, 12.0f),
                    PathNode.LineTo(15.707f, 14.293f),
                    PathNode.CurveTo(16.063234f, 14.649268f, 16.098803f, 15.214914f, 15.79f, 15.613f),
                    PathNode.LineTo(15.707f, 15.707f),
                    PathNode.CurveTo(15.350732f, 16.063234f, 14.785086f, 16.098803f, 14.387f, 15.79f),
                    PathNode.LineTo(14.293f, 15.707f),
                    PathNode.LineTo(11.293f, 12.707f),
                    PathNode.CurveTo(10.936765f, 12.350732f, 10.901197f, 11.785086f, 11.21f, 11.387f),
                    PathNode.LineTo(11.293f, 11.293f),
                    PathNode.LineTo(14.293f, 8.293f),
                    PathNode.Close,
                    PathNode.MoveTo(10.293f, 8.293f),
                    PathNode.CurveTo(10.666476f, 7.920789f, 11.264788f, 7.902519f, 11.660278f, 8.251249f),
                    PathNode.CurveTo(12.05577f, 8.599978f, 12.112535f, 9.19587f, 11.79f, 9.613f),
                    PathNode.LineTo(11.707f, 9.707f),
                    PathNode.LineTo(9.415f, 12.0f),
                    PathNode.LineTo(11.707f, 14.293f),
                    PathNode.CurveTo(12.063235f, 14.649268f, 12.098803f, 15.214914f, 11.79f, 15.613f),
                    PathNode.LineTo(11.707f, 15.707f),
                    PathNode.CurveTo(11.350732f, 16.063234f, 10.785086f, 16.098803f, 10.387f, 15.79f),
                    PathNode.LineTo(10.293f, 15.707f),
                    PathNode.LineTo(7.293f, 12.707f),
                    PathNode.CurveTo(6.936765f, 12.350732f, 6.901198f, 11.785086f, 7.21f, 11.387f),
                    PathNode.LineTo(7.293f, 11.293f),
                    PathNode.LineTo(10.293f, 8.293f),
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
        return _squareRoundedChevronsLeft!!
    }

private var _squareRoundedChevronsLeft: ImageVector? = null
