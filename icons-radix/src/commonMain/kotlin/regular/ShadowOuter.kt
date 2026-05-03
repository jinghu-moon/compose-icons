package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ShadowOuter: ImageVector
    get() {
        if (_shadowOuter != null) return _shadowOuter!!
        _shadowOuter = radixIcon(
            name = "ShadowOuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            group(
                groupAlpha = 0.05f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 12.140 3.886 C 13.855 4.942 15.000 6.837 15.000 9.000 C 15.000 12.314 12.314 15.000 9.000 15.000 C 6.843 15.000 4.953 13.862 3.896 12.155 L 4.321 11.892 C 5.291 13.458 7.024 14.500 9.000 14.500 C 12.038 14.500 14.500 12.038 14.500 9.000 C 14.500 7.018 13.451 5.280 11.878 4.312 L 12.140 3.886 Z"),
                    pathFillType = PathFillType.EvenOdd,
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1f,
                    stroke = null,
                    strokeAlpha = 1f,
                    strokeLineWidth = 0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                )
            }
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 12.851 5.073 C 13.868 6.071 14.500 7.462 14.500 9.000 C 14.500 12.038 12.038 14.500 9.000 14.500 C 7.462 14.500 6.071 13.868 5.073 12.851 L 5.430 12.501 C 6.338 13.426 7.602 14.000 9.000 14.000 C 11.761 14.000 14.000 11.761 14.000 9.000 C 14.000 7.602 13.426 6.338 12.501 5.430 L 12.851 5.073 Z"),
                    pathFillType = PathFillType.EvenOdd,
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1f,
                    stroke = null,
                    strokeAlpha = 1f,
                    strokeLineWidth = 0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                )
            }
            group(
                groupAlpha = 0.35f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 13.302 6.451 C 13.745 7.197 14.000 8.069 14.000 9.000 C 14.000 11.761 11.761 14.000 9.000 14.000 C 8.049 14.000 7.159 13.734 6.401 13.272 L 6.661 12.845 C 7.343 13.261 8.143 13.500 9.000 13.500 C 11.485 13.500 13.500 11.485 13.500 9.000 C 13.500 8.162 13.271 7.378 12.872 6.706 L 13.302 6.451 Z"),
                    pathFillType = PathFillType.EvenOdd,
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1f,
                    stroke = null,
                    strokeAlpha = 1f,
                    strokeLineWidth = 0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                )
            }
            group(
                groupAlpha = 0.5f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 13.374 7.940 C 13.457 8.280 13.500 8.635 13.500 9.000 C 13.500 11.485 11.485 13.500 9.000 13.500 C 8.611 13.500 8.233 13.451 7.873 13.358 L 7.998 12.873 C 8.318 12.956 8.653 13.000 9.000 13.000 C 11.209 13.000 13.000 11.209 13.000 9.000 C 13.000 8.675 12.961 8.360 12.888 8.058 L 13.374 7.940 Z"),
                    pathFillType = PathFillType.EvenOdd,
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1f,
                    stroke = null,
                    strokeAlpha = 1f,
                    strokeLineWidth = 0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                )
            }
            group(
                groupAlpha = 0.65f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 12.915 9.821 C 12.590 11.381 11.356 12.607 9.792 12.922 L 9.694 12.431 C 11.061 12.156 12.141 11.083 12.426 9.719 L 12.915 9.821 Z"),
                    pathFillType = PathFillType.EvenOdd,
                    fill = SolidColor(Color(0xFF000000)),
                    fillAlpha = 1f,
                    stroke = null,
                    strokeAlpha = 1f,
                    strokeLineWidth = 0f,
                    strokeLineCap = StrokeCap.Butt,
                    strokeLineJoin = StrokeJoin.Miter,
                )
            }
            addPath(
                pathData = parseSvgPathData("M 1.277 7.503 C 1.277 4.065 4.064 1.278 7.502 1.278 C 10.940 1.278 13.727 4.065 13.727 7.503 C 13.727 10.941 10.940 13.727 7.502 13.727 C 4.064 13.727 1.277 10.941 1.277 7.503 ZM 7.502 2.228 C 4.589 2.228 2.227 4.589 2.227 7.503 C 2.227 10.416 4.589 12.778 7.502 12.778 C 10.415 12.778 12.777 10.416 12.777 7.503 C 12.777 4.589 10.415 2.228 7.502 2.228 Z"),
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _shadowOuter!!
    }

private var _shadowOuter: ImageVector? = null
