package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareRoundedArrowDown: ImageVector
    get() {
        if (_squareRoundedArrowDown != null) return _squareRoundedArrowDown!!
        _squareRoundedArrowDown = tablerFilledIcon(
            name = "SquareRoundedArrowDown",
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(12.506975f, 7.000067f, 12.933684f, 7.379507f, 12.993f, 7.883f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(13.0f, 13.585f),
                    PathNode.LineTo(15.293f, 11.293f),
                    PathNode.CurveTo(15.649268f, 10.936765f, 16.214914f, 10.901197f, 16.613f, 11.21f),
                    PathNode.LineTo(16.707f, 11.293f),
                    PathNode.CurveTo(17.063234f, 11.649268f, 17.098803f, 12.214914f, 16.79f, 12.613f),
                    PathNode.LineTo(16.707f, 12.707f),
                    PathNode.LineTo(12.707f, 16.707f),
                    PathNode.CurveTo(12.672097f, 16.742037f, 12.634663f, 16.774458f, 12.595f, 16.804f),
                    PathNode.LineTo(12.485f, 16.875f),
                    PathNode.LineTo(12.371f, 16.929f),
                    PathNode.LineTo(12.266f, 16.964f),
                    PathNode.LineTo(12.117f, 16.994f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(11.925f, 16.997f),
                    PathNode.LineTo(11.799f, 16.98f),
                    PathNode.LineTo(11.688f, 16.95f),
                    PathNode.LineTo(11.577f, 16.906f),
                    PathNode.LineTo(11.479f, 16.854f),
                    PathNode.LineTo(11.387f, 16.79f),
                    PathNode.LineTo(11.293f, 16.707f),
                    PathNode.LineTo(7.293f, 12.707f),
                    PathNode.CurveTo(6.920789f, 12.333524f, 6.902519f, 11.735212f, 7.251249f, 11.339722f),
                    PathNode.CurveTo(7.599979f, 10.94423f, 8.195871f, 10.887465f, 8.613f, 11.21f),
                    PathNode.LineTo(8.707f, 11.293f),
                    PathNode.LineTo(11.0f, 13.585f),
                    PathNode.LineTo(11.0f, 8.0f),
                    PathNode.CurveTo(11.0f, 7.447716f, 11.447715f, 7.0f, 12.0f, 7.0f),
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
        return _squareRoundedArrowDown!!
    }

private var _squareRoundedArrowDown: ImageVector? = null
