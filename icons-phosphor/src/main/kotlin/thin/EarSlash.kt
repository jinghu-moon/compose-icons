package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.EarSlash: ImageVector
    get() {
        if (_earSlash != null) return _earSlash!!
        _earSlash = phosphorThinIcon(
            name = "EarSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(58.23f, 57.2f),
                    PathNode.CurveTo(48.914497f, 71.02653f, 43.957817f, 87.32818f, 44.0f, 104.0f),
                    PathNode.CurveTo(44.0f, 135.79f, 55.28f, 146.68f, 65.24f, 156.28f),
                    PathNode.CurveTo(73.16f, 163.91f, 80.0f, 170.51f, 80.0f, 188.0f),
                    PathNode.CurveTo(80.02756f, 214.49825f, 101.501755f, 235.97244f, 128.0f, 236.0f),
                    PathNode.CurveTo(141.71f, 236.0f, 153.52f, 230.13f, 163.08f, 218.55f),
                    PathNode.CurveTo(164.41818f, 216.84415f, 164.15372f, 214.38272f, 162.4837f, 213.00008f),
                    PathNode.CurveTo(160.81367f, 211.61745f, 158.34615f, 211.81699f, 156.92f, 213.45f),
                    PathNode.CurveTo(148.83f, 223.24f, 139.37f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(105.90861f, 228.0f, 88.0f, 210.09138f, 88.0f, 188.0f),
                    PathNode.CurveTo(88.0f, 167.11f, 79.25f, 158.67f, 70.79f, 150.52f),
                    PathNode.CurveTo(61.55f, 141.61f, 52.0f, 132.4f, 52.0f, 104.0f),
                    PathNode.CurveTo(51.96522f, 89.59414f, 56.060257f, 75.48015f, 63.8f, 63.33f),
                    PathNode.LineTo(86.8f, 88.6f),
                    PathNode.CurveTo(84.94809f, 93.52316f, 83.999565f, 98.74004f, 84.0f, 104.0f),
                    PathNode.CurveTo(84.0f, 106.20914f, 85.79086f, 108.0f, 88.0f, 108.0f),
                    PathNode.CurveTo(90.20914f, 108.0f, 92.0f, 106.20914f, 92.0f, 104.0f),
                    PathNode.CurveTo(91.99367f, 101.12705f, 92.32936f, 98.26358f, 93.0f, 95.47f),
                    PathNode.LineTo(141.65f, 149.0f),
                    PathNode.CurveTo(140.54884f, 152.56258f, 139.99257f, 156.27113f, 140.0f, 160.0f),
                    PathNode.CurveTo(140.00464f, 166.79051f, 143.45448f, 173.1148f, 149.16139f, 176.7948f),
                    PathNode.CurveTo(154.8683f, 180.47478f, 162.0526f, 181.00769f, 168.24f, 178.21f),
                    PathNode.LineTo(205.0f, 218.69f),
                    PathNode.CurveTo(205.95595f, 219.76758f, 207.41747f, 220.24792f, 208.8263f, 219.94757f),
                    PathNode.CurveTo(210.23512f, 219.64722f, 211.37364f, 218.61255f, 211.80698f, 217.23878f),
                    PathNode.CurveTo(212.24031f, 215.865f, 211.9015f, 214.36435f, 210.92f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 172.0f),
                    PathNode.CurveTo(153.37259f, 172.0f, 148.0f, 166.62741f, 148.0f, 160.0f),
                    PathNode.CurveTo(147.99866f, 158.73283f, 148.07883f, 157.46687f, 148.24f, 156.21f),
                    PathNode.LineTo(162.37f, 171.76f),
                    PathNode.CurveTo(161.58955f, 171.91606f, 160.79588f, 171.99643f, 160.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(83.55f, 37.36f),
                    PathNode.CurveTo(83.003365f, 36.45038f, 82.840614f, 35.360817f, 83.09756f, 34.331158f),
                    PathNode.CurveTo(83.35449f, 33.3015f, 84.010086f, 32.41615f, 84.92f, 31.87f),
                    PathNode.CurveTo(110.87803f, 16.362526f, 143.16765f, 16.003159f, 169.46439f, 30.929062f),
                    PathNode.CurveTo(195.76114f, 45.854965f, 212.00655f, 73.76259f, 212.0f, 104.0f),
                    PathNode.CurveTo(212.0f, 106.20914f, 210.20914f, 108.0f, 208.0f, 108.0f),
                    PathNode.CurveTo(205.79086f, 108.0f, 204.0f, 106.20914f, 204.0f, 104.0f),
                    PathNode.CurveTo(204.01067f, 76.63522f, 189.30923f, 51.377495f, 165.50957f, 37.871693f),
                    PathNode.CurveTo(141.70988f, 24.365894f, 112.48703f, 24.697544f, 89.0f, 38.74f),
                    PathNode.CurveTo(87.11187f, 39.84948f, 84.68259f, 39.23436f, 83.55f, 37.36f),
                    PathNode.Close,
                    PathNode.MoveTo(160.44f, 118.17f),
                    PathNode.CurveTo(162.78214f, 113.81448f, 164.00545f, 108.945305f, 164.0f, 104.0f),
                    PathNode.CurveTo(164.0024f, 92.37164f, 158.38783f, 81.45821f, 148.92574f, 74.699f),
                    PathNode.CurveTo(139.46362f, 67.93977f, 127.31932f, 66.167244f, 116.32f, 69.94f),
                    PathNode.CurveTo(114.2296f, 70.65521f, 111.95521f, 69.5404f, 111.24f, 67.45f),
                    PathNode.CurveTo(110.52478f, 65.359604f, 111.6396f, 63.08521f, 113.73f, 62.37f),
                    PathNode.CurveTo(127.17311f, 57.76103f, 142.01459f, 59.92868f, 153.57797f, 68.18993f),
                    PathNode.CurveTo(165.14134f, 76.45119f, 172.00267f, 89.78874f, 172.0f, 104.0f),
                    PathNode.CurveTo(171.99632f, 110.22212f, 170.46481f, 116.34816f, 167.54f, 121.84f),
                    PathNode.CurveTo(166.85449f, 123.163216f, 165.49023f, 123.99564f, 164.0f, 124.0f),
                    PathNode.CurveTo(163.36224f, 124.00308f, 162.7336f, 123.848495f, 162.17f, 123.55f),
                    PathNode.CurveTo(160.2084f, 122.540565f, 159.43442f, 120.13356f, 160.44f, 118.17f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _earSlash!!
    }

private var _earSlash: ImageVector? = null
