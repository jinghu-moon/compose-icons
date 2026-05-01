package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = phosphorFillIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 120.0f),
                    PathNode.CurveTo(228.0f, 142.63f, 222.0f, 156.72f, 210.07f, 161.87f),
                    PathNode.CurveTo(206.59003f, 163.33289f, 202.8445f, 164.05815f, 199.07f, 164.0f),
                    PathNode.CurveTo(196.24576f, 163.97493f, 193.43134f, 163.66333f, 190.67f, 163.07f),
                    PathNode.CurveTo(189.65068f, 162.86694f, 188.74844f, 162.27977f, 188.15f, 161.43f),
                    PathNode.CurveTo(174.10246f, 141.47426f, 158.10727f, 122.96337f, 140.4f, 106.17f),
                    PathNode.CurveTo(137.19122f, 103.13243f, 132.12756f, 103.271225f, 129.09f, 106.48f),
                    PathNode.CurveTo(126.05244f, 109.688774f, 126.19122f, 114.75243f, 129.4f, 117.79f),
                    PathNode.CurveTo(144.24f, 131.7f, 193.53f, 181.28f, 207.72f, 238.06f),
                    PathNode.CurveTo(208.79074f, 242.34563f, 206.18532f, 246.688f, 201.9f, 247.76f),
                    PathNode.CurveTo(201.27834f, 247.91458f, 200.64058f, 247.99513f, 200.0f, 248.0f),
                    PathNode.CurveTo(196.33313f, 247.99486f, 193.1392f, 245.49742f, 192.25f, 241.94f),
                    PathNode.CurveTo(188.13f, 225.47f, 180.6f, 209.46f, 171.79f, 194.85f),
                    PathNode.CurveTo(171.50842f, 197.33252f, 170.86844f, 199.76111f, 169.89f, 202.06f),
                    PathNode.CurveTo(164.72f, 214.0f, 150.63f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(105.37f, 220.0f, 91.28f, 214.0f, 86.12f, 202.06f),
                    PathNode.CurveTo(80.67f, 189.48f, 85.73f, 171.24f, 101.12f, 147.85f),
                    PathNode.CurveTo(101.8f, 146.85f, 102.48f, 145.85f, 103.12f, 144.85f),
                    PathNode.LineTo(100.12f, 146.85f),
                    PathNode.CurveTo(82.84f, 158.27f, 68.35f, 164.0f, 56.89f, 164.0f),
                    PathNode.CurveTo(53.115505f, 164.05815f, 49.36997f, 163.33289f, 45.89f, 161.87f),
                    PathNode.CurveTo(34.0f, 156.72f, 28.0f, 142.63f, 28.0f, 120.0f),
                    PathNode.CurveTo(28.0f, 97.37f, 34.0f, 83.28f, 45.93f, 78.12f),
                    PathNode.CurveTo(58.52f, 72.67f, 76.76f, 77.73f, 100.15f, 93.12f),
                    PathNode.LineTo(103.15f, 95.12f),
                    PathNode.QuadTo(102.15f, 93.62f, 101.15f, 92.12f),
                    PathNode.CurveTo(85.74f, 68.73f, 80.68f, 50.49f, 86.15f, 37.9f),
                    PathNode.CurveTo(91.28f, 26.0f, 105.37f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(150.63f, 20.0f, 164.72f, 26.0f, 169.88f, 37.93f),
                    PathNode.CurveTo(175.33f, 50.52f, 170.27f, 68.76f, 154.88f, 92.15f),
                    PathNode.QuadTo(153.88f, 93.68f, 152.88f, 95.15f),
                    PathNode.LineTo(155.88f, 93.15f),
                    PathNode.CurveTo(179.27f, 77.74f, 197.51f, 72.68f, 210.1f, 78.15f),
                    PathNode.CurveTo(222.0f, 83.28f, 228.0f, 97.37f, 228.0f, 120.0f),
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
        return _clover!!
    }

private var _clover: ImageVector? = null
