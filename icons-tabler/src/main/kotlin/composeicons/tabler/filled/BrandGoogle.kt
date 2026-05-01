package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandGoogle: ImageVector
    get() {
        if (_brandGoogle != null) return _brandGoogle!!
        _brandGoogle = tablerFilledIcon(
            name = "BrandGoogle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(14.290236f, 1.996759f, 16.51162f, 2.782896f, 18.29f, 4.226f),
                    PathNode.CurveTo(18.517273f, 4.410075f, 18.652569f, 4.684418f, 18.660263f, 4.976783f),
                    PathNode.CurveTo(18.667957f, 5.269147f, 18.547276f, 5.550226f, 18.33f, 5.746f),
                    PathNode.LineTo(16.82f, 7.108f),
                    PathNode.CurveTo(16.466335f, 7.426475f, 15.937221f, 7.451571f, 15.555f, 7.168f),
                    PathNode.CurveTo(13.469605f, 5.63527f, 10.636421f, 5.612449f, 8.526607f, 7.111387f),
                    PathNode.CurveTo(6.416792f, 8.610325f, 5.505879f, 11.293177f, 6.266868f, 13.766844f),
                    PathNode.CurveTo(7.027858f, 16.24051f, 9.289229f, 17.947453f, 11.876743f, 18.001324f),
                    PathNode.CurveTo(14.464258f, 18.055193f, 16.794714f, 16.443851f, 17.658f, 14.004f),
                    PathNode.LineTo(17.659f, 14.0f),
                    PathNode.LineTo(13.999f, 14.0f),
                    PathNode.CurveTo(13.492407f, 13.999427f, 13.066271f, 13.620114f, 13.007f, 13.117f),
                    PathNode.LineTo(13.0f, 13.0f),
                    PathNode.LineTo(13.0f, 11.0f),
                    PathNode.CurveTo(13.0f, 10.447715f, 13.447715f, 10.0f, 14.0f, 10.0f),
                    PathNode.LineTo(20.945f, 10.0f),
                    PathNode.CurveTo(21.45474f, 9.999965f, 21.882929f, 10.383352f, 21.939f, 10.89f),
                    PathNode.CurveTo(21.979f, 11.257f, 22.0f, 11.627f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f),
                    PathNode.CurveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f),
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
        return _brandGoogle!!
    }

private var _brandGoogle: ImageVector? = null
