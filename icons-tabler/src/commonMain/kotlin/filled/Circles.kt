package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Circles: ImageVector
    get() {
        if (_circles != null) return _circles!!
        _circles = tablerFilledIcon(
            name = "Circles",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.5f, 12.0f),
                    PathNode.CurveTo(9.233247f, 11.999842f, 11.460105f, 14.194495f, 11.499763f, 16.927454f),
                    PathNode.CurveTo(11.53942f, 19.660412f, 9.377177f, 21.918755f, 6.645077f, 21.997904f),
                    PathNode.CurveTo(3.912977f, 22.077051f, 1.623623f, 19.947672f, 1.505f, 17.217f),
                    PathNode.LineTo(1.5f, 17.0f),
                    PathNode.LineTo(1.505f, 16.783f),
                    PathNode.CurveTo(1.621178f, 14.108604f, 3.823083f, 12.000154f, 6.5f, 12.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.5f, 12.0f),
                    PathNode.CurveTo(20.233246f, 11.999842f, 22.460106f, 14.194495f, 22.499763f, 16.927454f),
                    PathNode.CurveTo(22.53942f, 19.660412f, 20.377178f, 21.918755f, 17.645077f, 21.997904f),
                    PathNode.CurveTo(14.912976f, 22.077051f, 12.623623f, 19.947672f, 12.505f, 17.217f),
                    PathNode.LineTo(12.5f, 17.0f),
                    PathNode.LineTo(12.505f, 16.783f),
                    PathNode.CurveTo(12.621179f, 14.108604f, 14.823082f, 12.000154f, 17.5f, 12.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(14.733247f, 1.999842f, 16.960106f, 4.194495f, 16.999763f, 6.927454f),
                    PathNode.CurveTo(17.03942f, 9.660413f, 14.877177f, 11.918755f, 12.145077f, 11.997903f),
                    PathNode.CurveTo(9.412976f, 12.077051f, 7.123623f, 9.947671f, 7.005f, 7.217f),
                    PathNode.LineTo(7.0f, 7.0f),
                    PathNode.LineTo(7.005f, 6.783f),
                    PathNode.CurveTo(7.121178f, 4.108605f, 9.323082f, 2.000155f, 12.0f, 2.0f),
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
        return _circles!!
    }

private var _circles: ImageVector? = null
