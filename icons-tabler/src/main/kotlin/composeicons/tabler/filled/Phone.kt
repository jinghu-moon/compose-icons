package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = tablerFilledIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 3.0f),
                    PathNode.CurveTo(9.365167f, 2.999898f, 9.701355f, 3.198851f, 9.877f, 3.519f),
                    PathNode.LineTo(9.928f, 3.629f),
                    PathNode.LineTo(11.928f, 8.629f),
                    PathNode.CurveTo(12.093472f, 9.042233f, 11.965882f, 9.515093f, 11.615f, 9.789f),
                    PathNode.LineTo(11.515f, 9.857f),
                    PathNode.LineTo(9.841f, 10.861f),
                    PathNode.LineTo(9.904f, 10.964f),
                    PathNode.CurveTo(10.700758f, 12.228992f, 11.771008f, 13.299242f, 13.036f, 14.096f),
                    PathNode.LineTo(13.138f, 14.158f),
                    PathNode.LineTo(14.143f, 12.486f),
                    PathNode.CurveTo(14.371795f, 12.104075f, 14.825524f, 11.919404f, 15.256f, 12.033f),
                    PathNode.LineTo(15.371f, 12.072f),
                    PathNode.LineTo(20.371f, 14.072f),
                    PathNode.CurveTo(20.710104f, 14.207287f, 20.948528f, 14.516624f, 20.993f, 14.879f),
                    PathNode.LineTo(21.0f, 15.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.657f, 19.657f, 22.0f, 17.94f, 21.998f),
                    PathNode.CurveTo(9.361f, 21.477f, 2.522f, 14.638f, 2.0f, 6.0f),
                    PathNode.CurveTo(1.999912f, 4.411443f, 3.238179f, 3.098195f, 4.824f, 3.005f),
                    PathNode.LineTo(5.0f, 3.0f),
                    PathNode.LineTo(9.0f, 3.0f),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
