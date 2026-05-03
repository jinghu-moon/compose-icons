package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ferry: ImageVector
    get() {
        if (_ferry != null) return _ferry!!
        _ferry = tablerFilledIcon(
            name = "Ferry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.359304f, 12.000063f, 22.690956f, 12.192883f, 22.868776f, 12.505101f),
                    PathNode.CurveTo(23.046597f, 12.817319f, 23.043245f, 13.200935f, 22.86f, 13.51f),
                    PathNode.LineTo(20.658f, 17.219f),
                    PathNode.CurveTo(19.901468f, 18.334387f, 18.640747f, 19.001652f, 17.293f, 19.0f),
                    PathNode.LineTo(2.0f, 19.0f),
                    PathNode.CurveTo(1.683174f, 19.000088f, 1.385049f, 18.850033f, 1.196375f, 18.59551f),
                    PathNode.CurveTo(1.007702f, 18.340988f, 0.950804f, 18.012115f, 1.043f, 17.709f),
                    PathNode.LineTo(2.564f, 12.709f),
                    PathNode.CurveTo(2.692127f, 12.287755f, 3.0807f, 11.999878f, 3.521f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(19.0f, 13.0f),
                    PathNode.CurveTo(18.447716f, 13.0f, 18.0f, 13.447715f, 18.0f, 14.0f),
                    PathNode.CurveTo(18.0f, 14.552285f, 18.447716f, 15.0f, 19.0f, 15.0f),
                    PathNode.CurveTo(19.552284f, 15.0f, 20.0f, 14.552285f, 20.0f, 14.0f),
                    PathNode.CurveTo(20.0f, 13.447715f, 19.552284f, 13.0f, 19.0f, 13.0f),
                    PathNode.MoveTo(13.894f, 5.553f),
                    PathNode.LineTo(14.617f, 7.0f),
                    PathNode.LineTo(15.491f, 7.0f),
                    PathNode.CurveTo(15.846925f, 7.000102f, 16.17597f, 7.189379f, 16.355f, 7.497f),
                    PathNode.LineTo(18.392f, 11.0f),
                    PathNode.LineTo(5.56f, 11.0f),
                    PathNode.LineTo(6.533f, 7.716f),
                    PathNode.CurveTo(6.658697f, 7.291629f, 7.048404f, 7.000365f, 7.491f, 7.0f),
                    PathNode.LineTo(12.381f, 7.0f),
                    PathNode.LineTo(12.106f, 6.447f),
                    PathNode.CurveTo(11.87944f, 5.956548f, 12.08339f, 5.374822f, 12.566607f, 5.133214f),
                    PathNode.CurveTo(13.049824f, 4.891605f, 13.637574f, 5.077481f, 13.894f, 5.553f)
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
        return _ferry!!
    }

private var _ferry: ImageVector? = null
