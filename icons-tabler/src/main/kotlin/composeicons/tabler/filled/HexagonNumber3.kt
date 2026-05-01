package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.HexagonNumber3: ImageVector
    get() {
        if (_hexagonNumber3 != null) return _hexagonNumber3!!
        _hexagonNumber3 = tablerFilledIcon(
            name = "HexagonNumber3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.425f, 1.414f),
                    PathNode.CurveTo(11.425951f, 0.862041f, 12.640049f, 0.862041f, 13.641f, 1.414f),
                    PathNode.LineTo(20.416f, 5.409f),
                    PathNode.CurveTo(20.483f, 5.449f, 20.543f, 5.493f, 20.596f, 5.542f),
                    PathNode.LineTo(20.604f, 5.549f),
                    PathNode.LineTo(20.711f, 5.625f),
                    PathNode.CurveTo(21.469797f, 6.193948f, 21.93949f, 7.068221f, 21.995f, 8.015001f),
                    PathNode.LineTo(22.0f, 8.218001f),
                    PathNode.LineTo(22.0f, 15.502f),
                    PathNode.CurveTo(22.0f, 16.677f, 21.357f, 17.758f, 20.377f, 18.295f),
                    PathNode.LineTo(13.573f, 22.597f),
                    PathNode.CurveTo(12.593f, 23.135f, 11.407f, 23.135f, 10.373f, 22.565f),
                    PathNode.LineTo(3.678f, 18.328f),
                    PathNode.CurveTo(2.644772f, 17.762896f, 2.001581f, 16.679667f, 2.0f, 15.502f),
                    PathNode.LineTo(2.0f, 8.217f),
                    PathNode.CurveTo(1.999071f, 7.050762f, 2.630744f, 5.97577f, 3.65f, 5.409f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 7.0f),
                    PathNode.LineTo(11.0f, 7.0f),
                    PathNode.LineTo(10.85f, 7.005f),
                    PathNode.CurveTo(9.806323f, 7.083497f, 8.999669f, 7.953376f, 9.0f, 9.0f),
                    PathNode.CurveTo(8.99823f, 9.508837f, 9.378841f, 9.937869f, 9.884262f, 9.996758f),
                    PathNode.CurveTo(10.389683f, 10.055648f, 10.858736f, 9.725614f, 10.974f, 9.23f),
                    PathNode.LineTo(10.994f, 9.117f),
                    PathNode.LineTo(11.0f, 9.0f),
                    PathNode.LineTo(13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(10.867f, 11.007f),
                    PathNode.CurveTo(9.756f, 11.127f, 9.713f, 12.737f, 10.739f, 12.972f),
                    PathNode.LineTo(10.867f, 12.993f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(10.993f, 14.883f),
                    PathNode.CurveTo(10.93051f, 14.35761f, 10.469579f, 13.971821f, 9.941395f, 14.002828f),
                    PathNode.CurveTo(9.413211f, 14.033835f, 9.000587f, 14.470906f, 9.0f, 15.0f),
                    PathNode.CurveTo(8.999669f, 16.046625f, 9.806323f, 16.916504f, 10.85f, 16.995f),
                    PathNode.LineTo(11.0f, 17.0f),
                    PathNode.LineTo(13.0f, 17.0f),
                    PathNode.LineTo(13.15f, 16.995f),
                    PathNode.CurveTo(14.133892f, 16.92106f, 14.916854f, 16.140646f, 14.994f, 15.157f),
                    PathNode.LineTo(15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.LineTo(14.995f, 12.85f),
                    PathNode.CurveTo(14.977548f, 12.619473f, 14.920018f, 12.393757f, 14.825f, 12.183f),
                    PathNode.LineTo(14.75f, 12.031f),
                    PathNode.LineTo(14.731f, 11.999f),
                    PathNode.LineTo(14.751f, 11.969f),
                    PathNode.CurveTo(14.886165f, 11.723751f, 14.968593f, 11.452964f, 14.993f, 11.174f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.LineTo(15.0f, 9.0f),
                    PathNode.LineTo(14.995f, 8.85f),
                    PathNode.CurveTo(14.921061f, 7.866108f, 14.140646f, 7.083146f, 13.157f, 7.006f),
                    PathNode.LineTo(13.0f, 7.0f),
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
        return _hexagonNumber3!!
    }

private var _hexagonNumber3: ImageVector? = null
