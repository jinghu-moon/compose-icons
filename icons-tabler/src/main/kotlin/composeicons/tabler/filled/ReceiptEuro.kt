package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ReceiptEuro: ImageVector
    get() {
        if (_receiptEuro != null) return _receiptEuro!!
        _receiptEuro = tablerFilledIcon(
            name = "ReceiptEuro",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 2.0f),
                    PathNode.CurveTo(18.656855f, 2.0f, 20.0f, 3.343146f, 20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(20.000055f, 21.368887f, 19.797022f, 21.707846f, 19.471766f, 21.881874f),
                    PathNode.CurveTo(19.14651f, 22.055902f, 18.751858f, 22.036732f, 18.445f, 21.832f),
                    PathNode.LineTo(16.127f, 20.287f),
                    PathNode.LineTo(14.707f, 21.707f),
                    PathNode.CurveTo(14.350732f, 22.063234f, 13.785086f, 22.098803f, 13.387f, 21.79f),
                    PathNode.LineTo(13.293f, 21.707f),
                    PathNode.LineTo(12.0f, 20.415f),
                    PathNode.LineTo(10.707f, 21.707f),
                    PathNode.CurveTo(10.350732f, 22.063234f, 9.785086f, 22.098803f, 9.387f, 21.79f),
                    PathNode.LineTo(9.293f, 21.707f),
                    PathNode.LineTo(7.872f, 20.287f),
                    PathNode.LineTo(5.555f, 21.832f),
                    PathNode.CurveTo(5.264776f, 22.026232f, 4.894251f, 22.054993f, 4.577531f, 21.907871f),
                    PathNode.CurveTo(4.260812f, 21.76075f, 4.043784f, 21.45906f, 4.005f, 21.112f),
                    PathNode.LineTo(4.0f, 21.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 3.343146f, 5.343146f, 2.0f, 7.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.125f, 6.0f),
                    PathNode.CurveTo(11.079f, 6.0f, 9.457f, 7.746f, 9.082f, 10.0f),
                    PathNode.LineTo(9.0f, 10.0f),
                    PathNode.CurveTo(8.447715f, 10.0f, 8.0f, 10.447715f, 8.0f, 11.0f),
                    PathNode.CurveTo(8.0f, 11.552285f, 8.447715f, 12.0f, 9.0f, 12.0f),
                    PathNode.LineTo(9.082f, 12.0f),
                    PathNode.CurveTo(9.458f, 14.254f, 11.079f, 16.0f, 13.125f, 16.0f),
                    PathNode.CurveTo(14.231f, 16.0f, 15.178f, 15.535f, 15.832f, 14.555f),
                    PathNode.CurveTo(16.138517f, 14.095499f, 16.014502f, 13.474518f, 15.555f, 13.168f),
                    PathNode.CurveTo(15.095499f, 12.861482f, 14.474518f, 12.985499f, 14.168f, 13.445f),
                    PathNode.CurveTo(13.901f, 13.846f, 13.588f, 14.0f, 13.125f, 14.0f),
                    PathNode.CurveTo(12.243f, 14.0f, 11.425f, 13.186f, 11.123f, 12.001f),
                    PathNode.LineTo(13.0f, 12.0f),
                    PathNode.CurveTo(13.552285f, 12.0f, 14.0f, 11.552285f, 14.0f, 11.0f),
                    PathNode.CurveTo(14.0f, 10.447715f, 13.552285f, 10.0f, 13.0f, 10.0f),
                    PathNode.LineTo(11.123f, 10.0f),
                    PathNode.CurveTo(11.424f, 8.814f, 12.243f, 8.0f, 13.125f, 8.0f),
                    PathNode.CurveTo(13.587f, 8.0f, 13.901f, 8.154001f, 14.168f, 8.555f),
                    PathNode.CurveTo(14.474518f, 9.014501f, 15.095499f, 9.138518f, 15.555f, 8.832f),
                    PathNode.CurveTo(16.014502f, 8.525482f, 16.138517f, 7.904501f, 15.832f, 7.445f),
                    PathNode.CurveTo(15.178f, 6.465f, 14.232f, 6.0f, 13.125f, 6.0f)
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
        return _receiptEuro!!
    }

private var _receiptEuro: ImageVector? = null
