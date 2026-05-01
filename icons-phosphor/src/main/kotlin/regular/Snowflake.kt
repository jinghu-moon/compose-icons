package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Snowflake: ImageVector
    get() {
        if (_snowflake != null) return _snowflake!!
        _snowflake = phosphorRegularIcon(
            name = "Snowflake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.77f, 150.09f),
                    PathNode.CurveTo(224.27693f, 152.15076f, 223.94427f, 154.32849f, 222.84526f, 156.14392f),
                    PathNode.CurveTo(221.74625f, 157.95937f, 219.97092f, 159.26375f, 217.91f, 159.77f),
                    PathNode.LineTo(193.27f, 165.77f),
                    PathNode.LineTo(199.73f, 189.88f),
                    PathNode.CurveTo(200.27965f, 191.93015f, 199.99205f, 194.11469f, 198.9305f, 195.95271f),
                    PathNode.CurveTo(197.86894f, 197.79074f, 196.12047f, 199.13156f, 194.07f, 199.68f),
                    PathNode.CurveTo(193.3964f, 199.87418f, 192.70079f, 199.9817f, 192.0f, 200.0f),
                    PathNode.CurveTo(188.38174f, 199.99658f, 185.21622f, 197.56503f, 184.28f, 194.07f),
                    PathNode.LineTo(176.56f, 165.27f),
                    PathNode.LineTo(136.0f, 141.86f),
                    PathNode.LineTo(136.0f, 188.69f),
                    PathNode.LineTo(157.66f, 210.34f),
                    PathNode.CurveTo(160.78593f, 213.46593f, 160.78593f, 218.53407f, 157.66f, 221.66f),
                    PathNode.CurveTo(154.53407f, 224.78593f, 149.46593f, 224.78593f, 146.34f, 221.66f),
                    PathNode.LineTo(128.0f, 203.31f),
                    PathNode.LineTo(109.66f, 221.66f),
                    PathNode.CurveTo(106.534065f, 224.78593f, 101.465935f, 224.78593f, 98.34f, 221.66f),
                    PathNode.CurveTo(95.214066f, 218.53407f, 95.214066f, 213.46593f, 98.34f, 210.34f),
                    PathNode.LineTo(120.0f, 188.69f),
                    PathNode.LineTo(120.0f, 141.86f),
                    PathNode.LineTo(79.45f, 165.27f),
                    PathNode.LineTo(71.73f, 194.07f),
                    PathNode.CurveTo(70.792816f, 197.56862f, 67.62196f, 200.00111f, 64.0f, 200.0f),
                    PathNode.CurveTo(63.298004f, 199.99886f, 62.59902f, 199.90813f, 61.92f, 199.73f),
                    PathNode.CurveTo(59.86953f, 199.18156f, 58.12106f, 197.84076f, 57.059505f, 196.00272f),
                    PathNode.CurveTo(55.997955f, 194.16469f, 55.710346f, 191.98015f, 56.26f, 189.93f),
                    PathNode.LineTo(62.72f, 165.82f),
                    PathNode.LineTo(38.08f, 159.82f),
                    PathNode.CurveTo(33.788746f, 158.76514f, 31.165136f, 154.43126f, 32.22f, 150.14f),
                    PathNode.CurveTo(33.274864f, 145.84875f, 37.60875f, 143.22514f, 41.9f, 144.28f),
                    PathNode.LineTo(71.35f, 151.51f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.LineTo(71.36f, 104.54f),
                    PathNode.LineTo(41.91f, 111.77f),
                    PathNode.CurveTo(41.28517f, 111.92468f, 40.64369f, 112.00193f, 40.0f, 112.0f),
                    PathNode.CurveTo(35.951645f, 112.00279f, 32.539288f, 108.98089f, 32.052525f, 104.9619f),
                    PathNode.CurveTo(31.565762f, 100.94292f, 34.158035f, 97.19376f, 38.09f, 96.23f),
                    PathNode.LineTo(62.73f, 90.23f),
                    PathNode.LineTo(56.27f, 66.07f),
                    PathNode.CurveTo(55.126774f, 61.80084f, 57.66084f, 57.41323f, 61.93f, 56.27f),
                    PathNode.CurveTo(66.19916f, 55.126774f, 70.58677f, 57.66084f, 71.73f, 61.93f),
                    PathNode.LineTo(79.45f, 90.73f),
                    PathNode.LineTo(120.0f, 114.14f),
                    PathNode.LineTo(120.0f, 67.31f),
                    PathNode.LineTo(98.34f, 45.66f),
                    PathNode.CurveTo(95.214066f, 42.53407f, 95.214066f, 37.46593f, 98.34f, 34.34f),
                    PathNode.CurveTo(101.465935f, 31.21407f, 106.534065f, 31.214067f, 109.66f, 34.34f),
                    PathNode.LineTo(128.0f, 52.69f),
                    PathNode.LineTo(146.34f, 34.34f),
                    PathNode.CurveTo(149.46593f, 31.214067f, 154.53407f, 31.21407f, 157.66f, 34.34f),
                    PathNode.CurveTo(160.78593f, 37.46593f, 160.78593f, 42.53407f, 157.66f, 45.66f),
                    PathNode.LineTo(136.0f, 67.31f),
                    PathNode.LineTo(136.0f, 114.14f),
                    PathNode.LineTo(176.55f, 90.73f),
                    PathNode.LineTo(184.27f, 61.93f),
                    PathNode.CurveTo(185.41322f, 57.66084f, 189.80084f, 55.126774f, 194.07f, 56.27f),
                    PathNode.CurveTo(198.33916f, 57.41323f, 200.87323f, 61.80084f, 199.73f, 66.07f),
                    PathNode.LineTo(193.27f, 90.18f),
                    PathNode.LineTo(217.91f, 96.18f),
                    PathNode.CurveTo(221.95761f, 97.04442f, 224.6776f, 100.85344f, 224.1815f, 104.96248f),
                    PathNode.CurveTo(223.6854f, 109.07152f, 220.13704f, 112.12374f, 216.0f, 112.0f),
                    PathNode.CurveTo(215.35631f, 112.00193f, 214.71483f, 111.92468f, 214.09f, 111.77f),
                    PathNode.LineTo(184.64f, 104.54f),
                    PathNode.LineTo(144.0f, 128.0f),
                    PathNode.LineTo(184.64f, 151.46f),
                    PathNode.LineTo(214.09f, 144.23f),
                    PathNode.CurveTo(216.15076f, 143.72307f, 218.32849f, 144.05573f, 220.14392f, 145.15474f),
                    PathNode.CurveTo(221.95937f, 146.25375f, 223.26375f, 148.02908f, 223.77f, 150.09f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _snowflake!!
    }

private var _snowflake: ImageVector? = null
