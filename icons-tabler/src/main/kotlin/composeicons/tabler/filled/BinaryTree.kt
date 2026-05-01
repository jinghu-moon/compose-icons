package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BinaryTree: ImageVector
    get() {
        if (_binaryTree != null) return _binaryTree!!
        _binaryTree = tablerFilledIcon(
            name = "BinaryTree",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 1.0f),
                    PathNode.CurveTo(15.151908f, 0.999793f, 16.20221f, 1.659159f, 16.702642f, 2.696684f),
                    PathNode.CurveTo(17.203075f, 3.734209f, 17.065254f, 4.966647f, 16.348f, 5.868f),
                    PathNode.LineTo(18.348f, 9.071f),
                    PathNode.QuadTo(18.665f, 9.0f, 19.0f, 9.0f),
                    PathNode.CurveTo(20.399408f, 8.999784f, 21.61308f, 9.967126f, 21.924992f, 11.33133f),
                    PathNode.CurveTo(22.236906f, 12.695535f, 21.5642f, 14.09418f, 20.303743f, 14.702121f),
                    PathNode.CurveTo(19.043285f, 15.310061f, 17.529938f, 14.965789f, 16.656517f, 13.87241f),
                    PathNode.CurveTo(15.783094f, 12.779032f, 15.781635f, 11.227019f, 16.653f, 10.132f),
                    PathNode.LineTo(14.653f, 6.929f),
                    PathNode.CurveTo(14.223591f, 7.02461f, 13.778409f, 7.02461f, 13.349f, 6.929f),
                    PathNode.LineTo(11.348f, 10.132f),
                    PathNode.CurveTo(11.756f, 10.645f, 12.0f, 11.294f, 12.0f, 12.0f),
                    PathNode.CurveTo(12.0f, 12.706f, 11.756f, 13.356f, 11.347f, 13.868f),
                    PathNode.LineTo(13.349f, 17.071f),
                    PathNode.QuadTo(13.664f, 17.0f, 14.0f, 17.0f),
                    PathNode.CurveTo(15.399408f, 16.999784f, 16.61308f, 17.967125f, 16.924992f, 19.33133f),
                    PathNode.CurveTo(17.236906f, 20.695534f, 16.5642f, 22.09418f, 15.303742f, 22.702122f),
                    PathNode.CurveTo(14.043286f, 23.310062f, 12.529939f, 22.96579f, 11.656516f, 21.87241f),
                    PathNode.CurveTo(10.783094f, 20.779032f, 10.781635f, 19.227018f, 11.653f, 18.132f),
                    PathNode.LineTo(9.65f, 14.929f),
                    PathNode.CurveTo(9.221233f, 15.024314f, 8.776767f, 15.024314f, 8.348f, 14.929f),
                    PathNode.LineTo(6.346f, 18.132f),
                    PathNode.CurveTo(7.256028f, 19.275105f, 7.210177f, 20.907572f, 6.237423f, 21.997795f),
                    PathNode.CurveTo(5.264668f, 23.088018f, 3.647958f, 23.318882f, 2.40894f, 22.544497f),
                    PathNode.CurveTo(1.169923f, 21.77011f, 0.668994f, 20.215721f, 1.222707f, 18.863598f),
                    PathNode.CurveTo(1.77642f, 17.511473f, 3.223714f, 16.75491f, 4.65f, 17.072f),
                    PathNode.LineTo(6.652f, 13.868f),
                    PathNode.CurveTo(5.859394f, 12.873417f, 5.780031f, 11.48715f, 6.45395f, 10.408609f),
                    PathNode.CurveTo(7.12787f, 9.330068f, 8.408609f, 8.793653f, 9.65f, 9.07f),
                    PathNode.LineTo(11.652f, 5.868f),
                    PathNode.CurveTo(10.934746f, 4.966647f, 10.796925f, 3.734209f, 11.297358f, 2.696684f),
                    PathNode.CurveTo(11.797791f, 1.659159f, 12.848092f, 0.999793f, 14.0f, 1.0f)
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
        return _binaryTree!!
    }

private var _binaryTree: ImageVector? = null
