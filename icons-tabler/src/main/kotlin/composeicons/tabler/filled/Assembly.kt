package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Assembly: ImageVector
    get() {
        if (_assembly != null) return _assembly!!
        _assembly = tablerFilledIcon(
            name = "Assembly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.666f, 1.429f),
                    PathNode.LineTo(20.416f, 5.409f),
                    PathNode.QuadTo(20.516f, 5.469f, 20.596f, 5.542f),
                    PathNode.LineTo(20.605f, 5.55f),
                    PathNode.LineTo(20.711f, 5.625f),
                    PathNode.CurveTo(21.470114f, 6.193674f, 21.939894f, 7.068106f, 21.995f, 8.015001f),
                    PathNode.LineTo(22.0f, 8.218001f),
                    PathNode.LineTo(22.0f, 15.502f),
                    PathNode.CurveTo(22.0f, 16.677f, 21.357f, 17.758f, 20.377f, 18.295f),
                    PathNode.LineTo(13.573f, 22.597f),
                    PathNode.CurveTo(12.593f, 23.135f, 11.407f, 23.135f, 10.373f, 22.565f),
                    PathNode.LineTo(3.678f, 18.328f),
                    PathNode.CurveTo(2.645394f, 17.76225f, 2.002444f, 16.67943f, 2.0f, 15.502f),
                    PathNode.LineTo(2.0f, 8.217f),
                    PathNode.CurveTo(1.999071f, 7.050762f, 2.630744f, 5.97577f, 3.65f, 5.409f),
                    PathNode.LineTo(10.425f, 1.414f),
                    PathNode.CurveTo(11.435277f, 0.859754f, 12.659898f, 0.865424f, 13.665f, 1.429f),
                    PathNode.MoveTo(13.025f, 6.772f),
                    PathNode.CurveTo(12.407045f, 6.416456f, 11.647872f, 6.411143f, 11.025f, 6.758f),
                    PathNode.LineTo(8.002f, 8.562f),
                    PathNode.CurveTo(7.379678f, 8.917931f, 6.99691f, 9.581089f, 7.0f, 10.298f),
                    PathNode.LineTo(7.0f, 13.576f),
                    PathNode.CurveTo(6.999647f, 14.303208f, 7.394046f, 14.973304f, 8.03f, 15.326f),
                    PathNode.LineTo(10.976f, 17.216f),
                    PathNode.CurveTo(11.633f, 17.583f, 12.366f, 17.583f, 12.97f, 17.249f),
                    PathNode.LineTo(16.024f, 15.294f),
                    PathNode.CurveTo(16.606f, 14.972f, 17.0f, 14.302f, 17.0f, 13.575f),
                    PathNode.LineTo(17.0f, 10.298f),
                    PathNode.LineTo(16.995f, 10.134f),
                    PathNode.CurveTo(16.95283f, 9.590954f, 16.690996f, 9.088599f, 16.27f, 8.743f),
                    PathNode.LineTo(16.178f, 8.673f),
                    PathNode.LineTo(16.122f, 8.626f),
                    PathNode.CurveTo(16.091259f, 8.602837f, 16.059204f, 8.581468f, 16.026f, 8.562f),
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
        return _assembly!!
    }

private var _assembly: ImageVector? = null
