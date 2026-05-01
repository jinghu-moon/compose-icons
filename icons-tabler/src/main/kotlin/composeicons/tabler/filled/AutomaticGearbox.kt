package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AutomaticGearbox: ImageVector
    get() {
        if (_automaticGearbox != null) return _automaticGearbox!!
        _automaticGearbox = tablerFilledIcon(
            name = "AutomaticGearbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.0f, 16.0f),
                    PathNode.CurveTo(19.656855f, 16.0f, 21.0f, 17.343145f, 21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.656855f, 19.656855f, 22.0f, 18.0f, 22.0f),
                    PathNode.LineTo(17.0f, 22.0f),
                    PathNode.CurveTo(16.447716f, 22.0f, 16.0f, 21.552284f, 16.0f, 21.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.CurveTo(16.0f, 16.447716f, 16.447716f, 16.0f, 17.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 20.0f),
                    PathNode.LineTo(18.117f, 19.993f),
                    PathNode.CurveTo(18.642391f, 19.93051f, 19.02818f, 19.46958f, 18.997171f, 18.941395f),
                    PathNode.CurveTo(18.966166f, 18.41321f, 18.529093f, 18.000587f, 18.0f, 18.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.5f, 7.0f),
                    PathNode.CurveTo(19.880713f, 7.0f, 21.0f, 8.119289f, 21.0f, 9.5f),
                    PathNode.CurveTo(21.0f, 10.880712f, 19.880713f, 12.0f, 18.5f, 12.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(18.0f, 13.0f),
                    PathNode.CurveTo(17.999933f, 13.506975f, 17.620493f, 13.933684f, 17.117f, 13.993f),
                    PathNode.LineTo(17.0f, 14.0f),
                    PathNode.CurveTo(16.447716f, 14.0f, 16.0f, 13.552285f, 16.0f, 13.0f),
                    PathNode.LineTo(16.0f, 8.0f),
                    PathNode.CurveTo(16.0f, 7.447716f, 16.447716f, 7.0f, 17.0f, 7.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.0f, 10.0f),
                    PathNode.LineTo(18.5f, 10.0f),
                    PathNode.CurveTo(18.776142f, 10.0f, 19.0f, 9.776142f, 19.0f, 9.5f),
                    PathNode.CurveTo(19.0f, 9.223858f, 18.776142f, 9.0f, 18.5f, 9.0f),
                    PathNode.LineTo(18.0f, 9.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.0f, 10.0f),
                    PathNode.CurveTo(13.552285f, 10.0f, 14.0f, 10.447715f, 14.0f, 11.0f),
                    PathNode.CurveTo(14.0f, 11.552285f, 13.552285f, 12.0f, 13.0f, 12.0f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.LineTo(10.0f, 18.0f),
                    PathNode.LineTo(13.0f, 18.0f),
                    PathNode.CurveTo(13.552285f, 18.0f, 14.0f, 18.447716f, 14.0f, 19.0f),
                    PathNode.CurveTo(14.0f, 19.552284f, 13.552285f, 20.0f, 13.0f, 20.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.CurveTo(8.895431f, 20.0f, 8.0f, 19.10457f, 8.0f, 18.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(4.953376f, 12.000331f, 4.083497f, 11.193677f, 4.005f, 10.15f),
                    PathNode.LineTo(4.0f, 10.0f),
                    PathNode.LineTo(4.0f, 7.83f),
                    PathNode.CurveTo(2.800816f, 7.406025f, 1.999333f, 6.271927f, 2.0f, 5.0f),
                    PathNode.LineTo(2.005f, 4.824f),
                    PathNode.CurveTo(2.093679f, 3.323639f, 3.278921f, 2.120449f, 4.777779f, 2.009232f),
                    PathNode.CurveTo(6.276638f, 1.898014f, 7.626479f, 2.913097f, 7.935626f, 4.383939f),
                    PathNode.CurveTo(8.244773f, 5.85478f, 7.417805f, 7.327393f, 6.001f, 7.829f),
                    PathNode.LineTo(6.0f, 10.0f),
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
        return _automaticGearbox!!
    }

private var _automaticGearbox: ImageVector? = null
