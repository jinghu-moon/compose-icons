package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AdCircle: ImageVector
    get() {
        if (_adCircle != null) return _adCircle!!
        _adCircle = tablerFilledIcon(
            name = "AdCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(6.57f, 22.0f, 2.152f, 17.673f, 2.004f, 12.28f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.004f, 11.72f),
                    PathNode.CurveTo(2.152f, 6.327f, 6.57f, 2.0f, 12.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.5f, 8.0f),
                    PathNode.CurveTo(7.182805f, 7.999798f, 6.091408f, 9.021642f, 6.005f, 10.336f),
                    PathNode.LineTo(6.0f, 10.5f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.LineTo(6.007f, 15.117f),
                    PathNode.CurveTo(6.066837f, 15.62005f, 6.493403f, 15.998886f, 7.0f, 15.998886f),
                    PathNode.CurveTo(7.506597f, 15.998886f, 7.933164f, 15.62005f, 7.993f, 15.117f),
                    PathNode.LineTo(8.0f, 15.0f),
                    PathNode.LineTo(8.0f, 14.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.LineTo(9.007f, 15.117f),
                    PathNode.CurveTo(9.066836f, 15.62005f, 9.493402f, 15.998886f, 10.0f, 15.998886f),
                    PathNode.CurveTo(10.506598f, 15.998886f, 10.933164f, 15.62005f, 10.993f, 15.117f),
                    PathNode.LineTo(11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 10.5f),
                    PathNode.LineTo(10.995f, 10.336f),
                    PathNode.CurveTo(10.908592f, 9.021642f, 9.817195f, 7.999798f, 8.5f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(13.447715f, 8.0f, 13.0f, 8.447715f, 13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.CurveTo(13.0f, 15.552285f, 13.447715f, 16.0f, 14.0f, 16.0f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.CurveTo(16.656855f, 16.0f, 18.0f, 14.656855f, 18.0f, 13.0f),
                    PathNode.LineTo(18.0f, 11.0f),
                    PathNode.CurveTo(18.0f, 9.343145f, 16.656855f, 8.0f, 15.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.0f, 10.0f),
                    PathNode.CurveTo(15.552285f, 10.0f, 16.0f, 10.447715f, 16.0f, 11.0f),
                    PathNode.LineTo(16.0f, 13.0f),
                    PathNode.CurveTo(15.999933f, 13.506975f, 15.620493f, 13.933684f, 15.117f, 13.993f),
                    PathNode.LineTo(15.0f, 14.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.5f, 10.0f),
                    PathNode.CurveTo(8.741492f, 9.99992f, 8.948531f, 10.172452f, 8.992f, 10.41f),
                    PathNode.LineTo(9.0f, 10.5f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(8.0f, 10.5f),
                    PathNode.LineTo(8.008001f, 10.41f),
                    PathNode.CurveTo(8.051469f, 10.172452f, 8.258508f, 9.99992f, 8.5f, 10.0f),
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
        return _adCircle!!
    }

private var _adCircle: ImageVector? = null
