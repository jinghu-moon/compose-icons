package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Star: ImageVector
    get() {
        if (_star != null) return _star!!
        _star = lucideOutlineIcon(
            name = "Star",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.525f, 2.295f),
                    PathNode.CurveTo(11.614394f, 2.114392f, 11.798479f, 2.000106f, 12.0f, 2.000106f),
                    PathNode.CurveTo(12.201521f, 2.000106f, 12.385606f, 2.114392f, 12.475f, 2.295f),
                    PathNode.LineTo(14.785f, 6.974f),
                    PathNode.CurveTo(15.093904f, 7.599141f, 15.690096f, 8.032735f, 16.38f, 8.134f),
                    PathNode.LineTo(21.546f, 8.89f),
                    PathNode.CurveTo(21.745682f, 8.918931f, 21.911617f, 9.058732f, 21.974018f, 9.250607f),
                    PathNode.CurveTo(22.03642f, 9.442482f, 21.984465f, 9.653145f, 21.84f, 9.794f),
                    PathNode.LineTo(18.104f, 13.432f),
                    PathNode.CurveTo(17.603844f, 13.919401f, 17.375383f, 14.621609f, 17.493f, 15.31f),
                    PathNode.LineTo(18.375f, 20.45f),
                    PathNode.CurveTo(18.410254f, 20.649622f, 18.328556f, 20.85187f, 18.164543f, 20.970997f),
                    PathNode.CurveTo(18.00053f, 21.090124f, 17.782932f, 21.105265f, 17.604f, 21.01f),
                    PathNode.LineTo(12.986f, 18.582f),
                    PathNode.CurveTo(12.36832f, 18.257668f, 11.63068f, 18.257668f, 11.013f, 18.582f),
                    PathNode.LineTo(6.396f, 21.01f),
                    PathNode.CurveTo(6.217139f, 21.104689f, 5.999967f, 21.089252f, 5.836295f, 20.970219f),
                    PathNode.CurveTo(5.672624f, 20.851185f, 5.591028f, 20.649334f, 5.626f, 20.45f),
                    PathNode.LineTo(6.507f, 15.311f),
                    PathNode.CurveTo(6.625141f, 14.62227f, 6.396628f, 13.919524f, 5.896f, 13.432f),
                    PathNode.LineTo(2.16f, 9.795f),
                    PathNode.CurveTo(2.014313f, 9.654288f, 1.961561f, 9.442847f, 2.024079f, 9.250191f),
                    PathNode.CurveTo(2.086596f, 9.057535f, 2.253449f, 8.917356f, 2.454f, 8.889f),
                    PathNode.LineTo(7.619f, 8.134f),
                    PathNode.CurveTo(8.309715f, 8.033515f, 8.906842f, 7.599784f, 9.216f, 6.974f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _star!!
    }

private var _star: ImageVector? = null
