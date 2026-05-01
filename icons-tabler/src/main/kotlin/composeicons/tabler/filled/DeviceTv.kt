package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DeviceTv: ImageVector
    get() {
        if (_deviceTv != null) return _deviceTv!!
        _deviceTv = tablerFilledIcon(
            name = "DeviceTv",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.707f, 2.293f),
                    PathNode.LineTo(12.0f, 5.585f),
                    PathNode.LineTo(15.293f, 2.293f),
                    PathNode.CurveTo(15.649268f, 1.936765f, 16.214914f, 1.901198f, 16.613f, 2.21f),
                    PathNode.LineTo(16.707f, 2.293f),
                    PathNode.CurveTo(17.097382f, 2.6835f, 17.097382f, 3.3165f, 16.707f, 3.707f),
                    PathNode.LineTo(14.414f, 6.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(20.656855f, 6.0f, 22.0f, 7.343146f, 22.0f, 9.0f),
                    PathNode.LineTo(22.0f, 18.0f),
                    PathNode.CurveTo(22.0f, 19.656855f, 20.656855f, 21.0f, 19.0f, 21.0f),
                    PathNode.LineTo(5.0f, 21.0f),
                    PathNode.CurveTo(3.343146f, 21.0f, 2.0f, 19.656855f, 2.0f, 18.0f),
                    PathNode.LineTo(2.0f, 9.0f),
                    PathNode.CurveTo(2.0f, 7.343146f, 3.343146f, 6.0f, 5.0f, 6.0f),
                    PathNode.LineTo(9.585f, 6.0f),
                    PathNode.LineTo(7.293f, 3.707f),
                    PathNode.CurveTo(6.914028f, 3.314621f, 6.919448f, 2.690915f, 7.305182f, 2.305182f),
                    PathNode.CurveTo(7.690915f, 1.919448f, 8.314621f, 1.914028f, 8.707f, 2.293f)
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
        return _deviceTv!!
    }

private var _deviceTv: ImageVector? = null
