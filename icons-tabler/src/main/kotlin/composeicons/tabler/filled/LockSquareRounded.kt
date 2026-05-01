package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LockSquareRounded: ImageVector
    get() {
        if (_lockSquareRounded != null) return _lockSquareRounded!!
        _lockSquareRounded = tablerFilledIcon(
            name = "LockSquareRounded",
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(13.588557f, 5.999912f, 14.901805f, 7.238179f, 14.995f, 8.824f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.CurveTo(16.046625f, 9.999669f, 16.916504f, 10.806323f, 16.995f, 11.85f),
                    PathNode.LineTo(17.0f, 12.0f),
                    PathNode.LineTo(17.0f, 15.0f),
                    PathNode.CurveTo(17.000332f, 16.046625f, 16.193678f, 16.916504f, 15.15f, 16.995f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.CurveTo(7.953376f, 17.000332f, 7.083497f, 16.193678f, 7.005f, 15.15f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.CurveTo(6.999669f, 10.953375f, 7.806323f, 10.083497f, 8.85f, 10.005f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.LineTo(9.0f, 9.0f),
                    PathNode.CurveTo(9.0f, 7.343146f, 10.343145f, 6.0f, 12.0f, 6.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 12.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.CurveTo(11.493025f, 8.000067f, 11.066316f, 8.379507f, 11.007f, 8.883f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(11.0f, 10.0f),
                    PathNode.LineTo(13.0f, 10.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.CurveTo(13.0f, 8.447715f, 12.552285f, 8.0f, 12.0f, 8.0f),
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
        return _lockSquareRounded!!
    }

private var _lockSquareRounded: ImageVector? = null
