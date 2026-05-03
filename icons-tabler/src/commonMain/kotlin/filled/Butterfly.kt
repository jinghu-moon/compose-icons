package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = tablerFilledIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.117f, 6.244f),
                    PathNode.LineTo(17.345f, 6.32f),
                    PathNode.CurveTo(19.299639f, 7.014639f, 20.697172f, 8.749945f, 20.959202f, 10.80773f),
                    PathNode.CurveTo(21.221233f, 12.865515f, 20.30318f, 14.895679f, 18.585f, 16.058f),
                    PathNode.LineTo(18.522f, 16.097f),
                    PathNode.LineTo(18.542f, 16.131f),
                    PathNode.CurveTo(19.122358f, 17.229116f, 19.159678f, 18.534525f, 18.643f, 19.664f),
                    PathNode.LineTo(18.55f, 19.854f),
                    PathNode.CurveTo(18.044575f, 20.820833f, 17.16617f, 21.539272f, 16.118294f, 21.842873f),
                    PathNode.CurveTo(15.070415f, 22.146475f, 13.943997f, 22.008892f, 13.0f, 21.462f),
                    PathNode.LineTo(13.0f, 6.605f),
                    PathNode.CurveTo(14.273637f, 5.954106f, 15.750742f, 5.824975f, 17.118f, 6.245f)
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
                    PathNode.MoveTo(8.505f, 6.0f),
                    PathNode.CurveTo(9.39f, 6.0f, 10.241f, 6.21f, 11.0f, 6.597f),
                    PathNode.LineTo(11.0f, 21.467f),
                    PathNode.CurveTo(10.682994f, 21.649282f, 10.342488f, 21.787233f, 9.988f, 21.877f),
                    PathNode.LineTo(9.792f, 21.922f),
                    PathNode.CurveTo(8.317873f, 22.217854f, 6.802351f, 21.662079f, 5.868986f, 20.483347f),
                    PathNode.CurveTo(4.935621f, 19.304617f, 4.742082f, 17.702044f, 5.368f, 16.335f),
                    PathNode.LineTo(5.486f, 16.097f),
                    PathNode.LineTo(5.451f, 16.074f),
                    PathNode.CurveTo(3.721472f, 14.916068f, 2.793745f, 12.881028f, 3.054f, 10.816f),
                    PathNode.LineTo(3.088f, 10.583f),
                    PathNode.CurveTo(3.535066f, 7.939099f, 5.823569f, 6.002934f, 8.505f, 6.0f)
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
                    PathNode.MoveTo(14.445f, 2.168f),
                    PathNode.CurveTo(14.904501f, 1.861482f, 15.525482f, 1.985499f, 15.832f, 2.445f),
                    PathNode.CurveTo(16.138517f, 2.904501f, 16.014502f, 3.525482f, 15.555f, 3.832f),
                    PathNode.LineTo(12.555f, 5.832f),
                    PathNode.CurveTo(12.218963f, 6.0562f, 11.781037f, 6.0562f, 11.445f, 5.832f),
                    PathNode.LineTo(8.445f, 3.832f),
                    PathNode.CurveTo(7.985499f, 3.525482f, 7.861482f, 2.904501f, 8.168f, 2.445f),
                    PathNode.CurveTo(8.474518f, 1.985499f, 9.095499f, 1.861482f, 9.555f, 2.168f),
                    PathNode.LineTo(11.999f, 3.798f),
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
