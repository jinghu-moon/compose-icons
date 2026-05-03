package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = tablerFilledIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 2.0f),
                    PathNode.CurveTo(16.835672f, 1.999819f, 18.43585f, 3.24912f, 18.881f, 5.03f),
                    PathNode.LineTo(18.897f, 5.102f),
                    PathNode.LineTo(18.977f, 5.121f),
                    PathNode.CurveTo(20.313992f, 5.457586f, 21.383404f, 6.458979f, 21.807f, 7.771f),
                    PathNode.LineTo(21.864f, 7.964f),
                    PathNode.CurveTo(22.282393f, 9.523493f, 21.722155f, 11.181611f, 20.443653f, 12.167766f),
                    PathNode.CurveTo(19.16515f, 13.153921f, 17.419115f, 13.274711f, 16.017f, 12.474f),
                    PathNode.LineTo(15.97f, 12.445f),
                    PathNode.LineTo(12.445f, 15.97f),
                    PathNode.LineTo(12.487f, 16.04f),
                    PathNode.CurveTo(13.127307f, 17.178947f, 13.170989f, 18.558834f, 12.604f, 19.736f),
                    PathNode.LineTo(12.502f, 19.933f),
                    PathNode.CurveTo(11.64153f, 21.492737f, 9.853336f, 22.295507f, 8.116f, 21.902f),
                    PathNode.CurveTo(6.655834f, 21.570234f, 5.504342f, 20.448862f, 5.134f, 18.998f),
                    PathNode.LineTo(5.111f, 18.903f),
                    PathNode.LineTo(4.973f, 18.87f),
                    PathNode.CurveTo(3.607325f, 18.50572f, 2.535285f, 17.447744f, 2.153f, 16.087f),
                    PathNode.LineTo(2.103f, 15.888f),
                    PathNode.CurveTo(1.753735f, 14.345237f, 2.346424f, 12.741558f, 3.615053f, 11.796738f),
                    PathNode.CurveTo(4.883683f, 10.851917f, 6.589935f, 10.743443f, 7.968f, 11.52f),
                    PathNode.LineTo(8.036001f, 11.56f),
                    PathNode.LineTo(11.56f, 8.036001f),
                    PathNode.LineTo(11.524f, 7.975f),
                    PathNode.CurveTo(10.955473f, 6.970394f, 10.848656f, 5.76916f, 11.231f, 4.68f),
                    PathNode.LineTo(11.31f, 4.475f),
                    PathNode.CurveTo(11.928823f, 2.980189f, 13.387161f, 2.005333f, 15.005f, 2.005f),
                    PathNode.LineTo(14.866f, 2.009f),
                    PathNode.LineTo(14.886f, 2.006f),
                    PathNode.Close
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
        return _bone!!
    }

private var _bone: ImageVector? = null
