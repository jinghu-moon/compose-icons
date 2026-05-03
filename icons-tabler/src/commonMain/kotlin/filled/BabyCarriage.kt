package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = tablerFilledIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.5f, 2.0f),
                    PathNode.CurveTo(16.28603f, 2.000037f, 17.993353f, 2.734981f, 19.220982f, 4.032219f),
                    PathNode.CurveTo(20.44861f, 5.329458f, 21.08837f, 7.074682f, 20.99f, 8.858f),
                    PathNode.CurveTo(21.010698f, 9.011085f, 20.997034f, 9.166857f, 20.95f, 9.314f),
                    PathNode.CurveTo(20.665922f, 11.550857f, 19.24457f, 13.481429f, 17.193f, 14.417f),
                    PathNode.LineTo(17.725f, 16.012f),
                    PathNode.QuadTo(17.86f, 16.0f, 18.0f, 16.0f),
                    PathNode.CurveTo(19.656855f, 16.0f, 21.0f, 17.343145f, 21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 20.656855f, 19.656855f, 22.0f, 18.0f, 22.0f),
                    PathNode.CurveTo(16.343145f, 22.0f, 15.0f, 20.656855f, 15.0f, 19.0f),
                    PathNode.LineTo(15.005f, 18.824f),
                    PathNode.CurveTo(15.048596f, 18.080406f, 15.367265f, 17.379623f, 15.899f, 16.858f),
                    PathNode.LineTo(15.265f, 14.955f),
                    PathNode.QuadTo(14.888f, 15.0f, 14.5f, 15.0f),
                    PathNode.LineTo(11.825f, 15.0f),
                    PathNode.QuadTo(11.278f, 15.0f, 10.749f, 14.917f),
                    PathNode.LineTo(10.101f, 16.858f),
                    PathNode.CurveTo(11.072713f, 17.81136f, 11.280716f, 19.299486f, 10.607649f, 20.482744f),
                    PathNode.CurveTo(9.934581f, 21.666002f, 8.549176f, 22.247759f, 7.233112f, 21.899773f),
                    PathNode.CurveTo(5.917047f, 21.551786f, 5.000251f, 20.361294f, 5.0f, 19.0f),
                    PathNode.LineTo(5.004f, 18.824f),
                    PathNode.CurveTo(5.051522f, 18.01239f, 5.426409f, 17.25482f, 6.042833f, 16.724733f),
                    PathNode.CurveTo(6.659256f, 16.194647f, 7.464426f, 15.93744f, 8.274f, 16.012f),
                    PathNode.LineTo(8.834f, 14.33f),
                    PathNode.CurveTo(7.105638f, 13.51382f, 5.786196f, 12.026377f, 5.182f, 10.213f),
                    PathNode.LineTo(3.78f, 6.0f),
                    PathNode.LineTo(2.0f, 6.0f),
                    PathNode.CurveTo(1.493025f, 5.999933f, 1.066316f, 5.620493f, 1.007f, 5.117f),
                    PathNode.LineTo(1.0f, 5.0f),
                    PathNode.CurveTo(1.0f, 4.447716f, 1.447715f, 4.0f, 2.0f, 4.0f),
                    PathNode.LineTo(4.5f, 4.0f),
                    PathNode.CurveTo(4.930608f, 3.999896f, 5.312928f, 4.275458f, 5.449f, 4.684f),
                    PathNode.LineTo(6.553f, 8.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(13.0f, 3.0f),
                    PathNode.CurveTo(13.0f, 2.447715f, 13.447715f, 2.0f, 14.0f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.0f, 18.0f),
                    PathNode.CurveTo(7.447716f, 18.0f, 7.0f, 18.447716f, 7.0f, 19.0f),
                    PathNode.CurveTo(7.0f, 19.552284f, 7.447716f, 20.0f, 8.0f, 20.0f),
                    PathNode.CurveTo(8.552285f, 20.0f, 9.0f, 19.552284f, 9.0f, 19.0f),
                    PathNode.CurveTo(9.0f, 18.447716f, 8.552285f, 18.0f, 8.0f, 18.0f),
                    PathNode.MoveTo(18.0f, 18.0f),
                    PathNode.CurveTo(17.447716f, 18.0f, 17.0f, 18.447716f, 17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 19.552284f, 17.447716f, 20.0f, 18.0f, 20.0f),
                    PathNode.CurveTo(18.552284f, 20.0f, 19.0f, 19.552284f, 19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 18.447716f, 18.552284f, 18.0f, 18.0f, 18.0f)
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
