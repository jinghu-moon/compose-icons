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
            addPath(
                pathData = parseSvgPathData("M12.14 3.886C13.855 4.942 15 6.837 15 9 15 12.314 12.314 15 9 15 6.843 15 4.953 13.862 3.896 12.155l.425-.263c.97 1.566 2.703 2.608 4.679 2.608 3.038 0 5.5-2.462 5.5-5.5 0-1.982-1.049-3.72-2.622-4.688l.262-.426Z"),
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.05f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M12.851 5.073c1.017 .998 1.649 2.389 1.649 3.927 0 3.038-2.462 5.5-5.5 5.5-1.538 0-2.929-.632-3.927-1.649l.357-.35C6.338 13.426 7.602 14 9 14 11.761 14 14 11.761 14 9 14 7.602 13.426 6.338 12.501 5.43l.35-.357Z"),
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M13.302 6.451C13.745 7.197 14 8.069 14 9c0 2.761-2.239 5-5 5-.951 0-1.841-.266-2.599-.728l.26-.427c.681 .415 1.482 .655 2.339 .655 2.485 0 4.5-2.015 4.5-4.5 0-.838-.229-1.622-.628-2.294l.43-.255Z"),
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.35f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M13.374 7.94c.082 .34 .126 .695 .126 1.06 0 2.485-2.015 4.5-4.5 4.5-.389 0-.767-.049-1.127-.142l.125-.484c.32 .083 .656 .127 1.002 .127C11.209 13 13 11.209 13 9c0-.325-.039-.64-.112-.942l.486-.117Z"),
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M12.915 9.821c-.326 1.56-1.559 2.786-3.123 3.1l-.099-.49c1.368-.275 2.448-1.348 2.733-2.712l.489 .102Z"),
                pathFillType = PathFillType.EvenOdd,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.65f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M1.277 7.503C1.277 4.065 4.064 1.278 7.502 1.278c3.438 0 6.225 2.787 6.225 6.225 0 3.438-2.787 6.225-6.225 6.225C4.064 13.727 1.277 10.941 1.277 7.503ZM7.502 2.228C4.589 2.228 2.227 4.589 2.227 7.503c0 2.913 2.362 5.275 5.275 5.275 2.913 0 5.275-2.362 5.275-5.275C12.777 4.589 10.415 2.228 7.502 2.228Z"),
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
