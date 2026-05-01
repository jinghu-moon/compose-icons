package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Ghost3: ImageVector
    get() {
        if (_ghost3 != null) return _ghost3!!
        _ghost3 = tablerFilledIcon(
            name = "Ghost3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(16.418278f, 3.0f, 20.0f, 6.581722f, 20.0f, 11.0f),
                    PathNode.LineTo(20.0f, 17.954f),
                    PathNode.LineTo(20.009f, 18.057f),
                    PathNode.CurveTo(20.073277f, 19.141548f, 19.499865f, 20.16416f, 18.541f, 20.675f),
                    PathNode.LineTo(18.378f, 20.755f),
                    PathNode.CurveTo(17.267f, 21.257f, 15.958f, 20.975f, 15.112f, 20.015f),
                    PathNode.CurveTo(14.988806f, 19.857487f, 14.799968f, 19.765444f, 14.6f, 19.765444f),
                    PathNode.CurveTo(14.400032f, 19.765444f, 14.211194f, 19.857487f, 14.088f, 20.015f),
                    PathNode.CurveTo(13.585774f, 20.657635f, 12.815604f, 21.033207f, 12.0f, 21.033207f),
                    PathNode.CurveTo(11.184396f, 21.033207f, 10.414226f, 20.657635f, 9.912f, 20.015f),
                    PathNode.CurveTo(9.788693f, 19.857695f, 9.599873f, 19.765867f, 9.4f, 19.766f),
                    PathNode.CurveTo(9.2f, 19.766f, 9.011f, 19.858f, 8.85f, 20.062f),
                    PathNode.CurveTo(8.064912f, 20.951132f, 6.802161f, 21.24421f, 5.705703f, 20.79177f),
                    PathNode.CurveTo(4.609245f, 20.339333f, 3.920619f, 19.241047f, 3.991f, 18.057f),
                    PathNode.LineTo(4.001f, 17.953f),
                    PathNode.LineTo(4.008f, 17.876f),
                    PathNode.LineTo(4.0f, 17.95f),
                    PathNode.LineTo(4.0f, 11.0f),
                    PathNode.LineTo(4.004f, 10.75f),
                    PathNode.CurveTo(4.136081f, 6.527537f, 7.528519f, 3.135536f, 11.751f, 3.004f),
                    PathNode.Close,
                    PathNode.MoveTo(10.01f, 9.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.CurveTo(9.447715f, 9.0f, 9.0f, 9.447715f, 9.0f, 10.0f),
                    PathNode.CurveTo(9.0f, 10.552285f, 9.447715f, 11.0f, 10.0f, 11.0f),
                    PathNode.LineTo(10.01f, 11.0f),
                    PathNode.CurveTo(10.562284f, 11.0f, 11.01f, 10.552285f, 11.01f, 10.0f),
                    PathNode.CurveTo(11.01f, 9.447715f, 10.562284f, 9.0f, 10.01f, 9.0f),
                    PathNode.MoveTo(14.01f, 9.0f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.CurveTo(13.447715f, 9.0f, 13.0f, 9.447715f, 13.0f, 10.0f),
                    PathNode.CurveTo(13.0f, 10.552285f, 13.447715f, 11.0f, 14.0f, 11.0f),
                    PathNode.LineTo(14.01f, 11.0f),
                    PathNode.CurveTo(14.562284f, 11.0f, 15.01f, 10.552285f, 15.01f, 10.0f),
                    PathNode.CurveTo(15.01f, 9.447715f, 14.562284f, 9.0f, 14.01f, 9.0f)
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
        return _ghost3!!
    }

private var _ghost3: ImageVector? = null
