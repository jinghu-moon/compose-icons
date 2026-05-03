package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Calendar: ImageVector
    get() {
        if (_calendar != null) return _calendar!!
        _calendar = phosphorBoldIcon(
            name = "Calendar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(188.0f, 28.0f),
                    PathNode.LineTo(188.0f, 24.0f),
                    PathNode.CurveTo(188.0f, 17.372583f, 182.62741f, 12.0f, 176.0f, 12.0f),
                    PathNode.CurveTo(169.37259f, 12.0f, 164.0f, 17.372583f, 164.0f, 24.0f),
                    PathNode.LineTo(164.0f, 28.0f),
                    PathNode.LineTo(92.0f, 28.0f),
                    PathNode.LineTo(92.0f, 24.0f),
                    PathNode.CurveTo(92.0f, 17.372583f, 86.62742f, 12.0f, 80.0f, 12.0f),
                    PathNode.CurveTo(73.37258f, 12.0f, 68.0f, 17.372583f, 68.0f, 24.0f),
                    PathNode.LineTo(68.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 52.0f),
                    PathNode.CurveTo(68.0f, 58.62742f, 73.37258f, 64.0f, 80.0f, 64.0f),
                    PathNode.CurveTo(86.62742f, 64.0f, 92.0f, 58.62742f, 92.0f, 52.0f),
                    PathNode.LineTo(164.0f, 52.0f),
                    PathNode.CurveTo(164.0f, 58.62742f, 169.37259f, 64.0f, 176.0f, 64.0f),
                    PathNode.CurveTo(182.62741f, 64.0f, 188.0f, 58.62742f, 188.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.LineTo(204.0f, 76.0f),
                    PathNode.LineTo(52.0f, 76.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 100.0f),
                    PathNode.LineTo(204.0f, 100.0f),
                    PathNode.LineTo(204.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 124.0f),
                    PathNode.LineTo(112.0f, 180.0f),
                    PathNode.CurveTo(112.0f, 186.62741f, 106.62742f, 192.0f, 100.0f, 192.0f),
                    PathNode.CurveTo(93.37258f, 192.0f, 88.0f, 186.62741f, 88.0f, 180.0f),
                    PathNode.LineTo(88.0f, 143.32f),
                    PathNode.CurveTo(82.08057f, 145.2627f, 75.65899f, 142.35236f, 73.21774f, 136.62051f),
                    PathNode.CurveTo(70.7765f, 130.88866f, 73.12764f, 124.24195f, 78.63f, 121.32f),
                    PathNode.LineTo(94.63f, 113.32f),
                    PathNode.CurveTo(98.341705f, 111.462616f, 102.749695f, 111.65512f, 106.28534f, 113.829025f),
                    PathNode.CurveTo(109.820984f, 116.00293f, 111.98224f, 119.84954f, 112.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(173.49f, 157.88f),
                    PathNode.LineTo(163.9f, 168.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.CurveTo(174.62741f, 168.0f, 180.0f, 173.37259f, 180.0f, 180.0f),
                    PathNode.CurveTo(180.0f, 186.62741f, 174.62741f, 192.0f, 168.0f, 192.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.CurveTo(131.20691f, 191.99832f, 126.87454f, 189.14455f, 124.980675f, 184.74149f),
                    PathNode.CurveTo(123.086815f, 180.33841f, 123.99475f, 175.23067f, 127.29f, 171.75f),
                    PathNode.LineTo(155.45f, 142.0f),
                    PathNode.CurveTo(155.806f, 141.3933f, 155.99571f, 140.70343f, 156.0f, 140.0f),
                    PathNode.CurveTo(156.00465f, 138.18547f, 154.78732f, 136.59511f, 153.03453f, 136.12582f),
                    PathNode.CurveTo(151.28172f, 135.65652f, 149.4326f, 136.42589f, 148.53f, 138.0f),
                    PathNode.CurveTo(145.15562f, 143.6047f, 137.91376f, 145.4738f, 132.24844f, 142.2022f),
                    PathNode.CurveTo(126.58314f, 138.9306f, 124.582275f, 131.72404f, 127.75f, 126.0f),
                    PathNode.CurveTo(134.08592f, 115.02354f, 147.00475f, 109.67164f, 159.24677f, 112.9518f),
                    PathNode.CurveTo(171.48878f, 116.23196f, 180.001f, 127.32615f, 180.0f, 140.0f),
                    PathNode.CurveTo(180.01836f, 146.0862f, 178.03677f, 152.00989f, 174.36f, 156.86f),
                    PathNode.CurveTo(174.09175f, 157.21797f, 173.80118f, 157.55864f, 173.49f, 157.88f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _calendar!!
    }

private var _calendar: ImageVector? = null
