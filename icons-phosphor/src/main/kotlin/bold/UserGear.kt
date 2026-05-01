package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserGear: ImageVector
    get() {
        if (_userGear != null) return _userGear!!
        _userGear = phosphorBoldIcon(
            name = "UserGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.5f, 156.53f),
                    PathNode.CurveTo(172.62616f, 137.56212f, 182.07729f, 105.38627f, 172.04161f, 76.3839f),
                    PathNode.CurveTo(162.00594f, 47.381542f, 134.6896f, 27.928322f, 104.0f, 27.928322f),
                    PathNode.CurveTo(73.310394f, 27.928322f, 45.994072f, 47.381542f, 35.958393f, 76.3839f),
                    PathNode.CurveTo(25.922712f, 105.38627f, 35.373844f, 137.56212f, 59.5f, 156.53f),
                    PathNode.CurveTo(40.571224f, 164.25092f, 23.844963f, 176.53195f, 10.81f, 192.28f),
                    PathNode.CurveTo(6.546362f, 197.3555f, 7.204504f, 204.92636f, 12.28f, 209.19f),
                    PathNode.CurveTo(17.355497f, 213.45364f, 24.926361f, 212.7955f, 29.19f, 207.72f),
                    PathNode.CurveTo(48.54f, 184.69f, 75.11f, 172.0f, 104.0f, 172.0f),
                    PathNode.CurveTo(141.0f, 172.0f, 165.12f, 191.42f, 178.81f, 207.72f),
                    PathNode.CurveTo(183.07364f, 212.7955f, 190.6445f, 213.45364f, 195.72f, 209.19f),
                    PathNode.CurveTo(200.7955f, 204.92636f, 201.45364f, 197.3555f, 197.19f, 192.28f),
                    PathNode.CurveTo(184.15504f, 176.53195f, 167.42877f, 164.25092f, 148.5f, 156.53f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 100.0f),
                    PathNode.CurveTo(56.0f, 73.49033f, 77.49033f, 52.0f, 104.0f, 52.0f),
                    PathNode.CurveTo(130.50967f, 52.0f, 152.0f, 73.49033f, 152.0f, 100.0f),
                    PathNode.CurveTo(152.0f, 126.50967f, 130.50967f, 148.0f, 104.0f, 148.0f),
                    PathNode.CurveTo(77.501755f, 147.97244f, 56.02756f, 126.498245f, 56.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.53f, 140.0f),
                    PathNode.LineTo(239.42f, 142.31f),
                    PathNode.LineTo(243.81f, 148.36f),
                    PathNode.CurveTo(246.41692f, 151.82333f, 246.95334f, 156.42343f, 245.21329f, 160.39368f),
                    PathNode.CurveTo(243.47319f, 164.36392f, 239.72714f, 167.0871f, 235.41373f, 167.5174f),
                    PathNode.CurveTo(231.10031f, 167.94771f, 226.89012f, 166.01825f, 224.4f, 162.47f),
                    PathNode.LineTo(220.0f, 156.41f),
                    PathNode.LineTo(215.6f, 162.47f),
                    PathNode.CurveTo(213.10988f, 166.01825f, 208.89969f, 167.94771f, 204.58627f, 167.5174f),
                    PathNode.CurveTo(200.27286f, 167.0871f, 196.52681f, 164.36392f, 194.78671f, 160.39368f),
                    PathNode.CurveTo(193.04666f, 156.42343f, 193.58308f, 151.82333f, 196.19f, 148.36f),
                    PathNode.LineTo(200.58f, 142.31f),
                    PathNode.LineTo(193.47f, 140.0f),
                    PathNode.CurveTo(187.16566f, 137.95378f, 183.71379f, 131.18433f, 185.76f, 124.88f),
                    PathNode.CurveTo(187.80621f, 118.57567f, 194.57567f, 115.12379f, 200.88f, 117.17f),
                    PathNode.LineTo(208.0f, 119.48f),
                    PathNode.LineTo(208.0f, 112.0f),
                    PathNode.CurveTo(208.0f, 105.37258f, 213.37259f, 100.0f, 220.0f, 100.0f),
                    PathNode.CurveTo(226.62741f, 100.0f, 232.0f, 105.37258f, 232.0f, 112.0f),
                    PathNode.LineTo(232.0f, 119.48f),
                    PathNode.LineTo(239.12f, 117.17f),
                    PathNode.CurveTo(245.42433f, 115.12379f, 252.19379f, 118.57567f, 254.24f, 124.88f),
                    PathNode.CurveTo(256.28622f, 131.18433f, 252.83434f, 137.95378f, 246.53f, 140.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userGear!!
    }

private var _userGear: ImageVector? = null
