package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ManualGearbox: ImageVector
    get() {
        if (_manualGearbox != null) return _manualGearbox!!
        _manualGearbox = tablerFilledIcon(
            name = "ManualGearbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 3.0f),
                    PathNode.CurveTo(20.46174f, 2.999209f, 21.711267f, 4.052049f, 21.958427f, 5.492742f),
                    PathNode.CurveTo(22.205587f, 6.933436f, 21.378422f, 8.342544f, 20.0f, 8.829f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.CurveTo(20.0f, 11.656855f, 18.656855f, 13.0f, 17.0f, 13.0f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 15.171f),
                    PathNode.CurveTo(14.439381f, 15.679135f, 15.268007f, 17.186787f, 14.925459f, 18.674294f),
                    PathNode.CurveTo(14.582911f, 20.161802f, 13.178338f, 21.155186f, 11.661688f, 20.982597f),
                    PathNode.CurveTo(10.145037f, 20.810007f, 8.999572f, 19.52644f, 9.0f, 18.0f),
                    PathNode.LineTo(9.005f, 17.824f),
                    PathNode.CurveTo(9.075224f, 16.618437f, 9.861446f, 15.572505f, 11.0f, 15.17f),
                    PathNode.LineTo(11.0f, 13.0f),
                    PathNode.LineTo(6.0f, 13.0f),
                    PathNode.LineTo(6.0f, 15.171f),
                    PathNode.CurveTo(7.43938f, 15.679135f, 8.268008f, 17.186787f, 7.925459f, 18.674294f),
                    PathNode.CurveTo(7.582912f, 20.161802f, 6.178339f, 21.155186f, 4.661688f, 20.982597f),
                    PathNode.CurveTo(3.145037f, 20.810007f, 1.999572f, 19.52644f, 2.0f, 18.0f),
                    PathNode.LineTo(2.005f, 17.824f),
                    PathNode.CurveTo(2.075224f, 16.618437f, 2.861447f, 15.572505f, 4.0f, 15.17f),
                    PathNode.LineTo(4.0f, 8.829f),
                    PathNode.CurveTo(2.801163f, 8.405147f, 1.999757f, 7.271559f, 2.0f, 6.0f),
                    PathNode.LineTo(2.005f, 5.824f),
                    PathNode.CurveTo(2.093679f, 4.32364f, 3.278921f, 3.120449f, 4.777779f, 3.009232f),
                    PathNode.CurveTo(6.276638f, 2.898014f, 7.626479f, 3.913097f, 7.935626f, 5.383939f),
                    PathNode.CurveTo(8.244773f, 6.85478f, 7.417805f, 8.327393f, 6.001f, 8.829f),
                    PathNode.LineTo(6.0f, 11.0f),
                    PathNode.LineTo(11.0f, 11.0f),
                    PathNode.LineTo(11.0f, 8.83f),
                    PathNode.CurveTo(9.800817f, 8.406025f, 8.999333f, 7.271927f, 9.0f, 6.0f),
                    PathNode.LineTo(9.005f, 5.824f),
                    PathNode.CurveTo(9.093679f, 4.32364f, 10.27892f, 3.120449f, 11.77778f, 3.009232f),
                    PathNode.CurveTo(13.276638f, 2.898014f, 14.626478f, 3.913097f, 14.935625f, 5.383939f),
                    PathNode.CurveTo(15.244773f, 6.85478f, 14.417805f, 8.327393f, 13.001f, 8.829f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.LineTo(17.0f, 11.0f),
                    PathNode.CurveTo(17.552284f, 11.0f, 18.0f, 10.552285f, 18.0f, 10.0f),
                    PathNode.LineTo(18.0f, 8.83f),
                    PathNode.CurveTo(16.800816f, 8.406025f, 15.999333f, 7.271927f, 16.0f, 6.0f),
                    PathNode.LineTo(16.005f, 5.824f),
                    PathNode.CurveTo(16.098196f, 4.238179f, 17.411442f, 2.999912f, 19.0f, 3.0f)
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
        return _manualGearbox!!
    }

private var _manualGearbox: ImageVector? = null
