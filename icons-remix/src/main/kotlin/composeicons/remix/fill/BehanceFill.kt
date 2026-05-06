package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.BehanceFill: ImageVector
    get() {
        if (_behanceFill != null) return _behanceFill!!
        _behanceFill = remixIcon(
            name = "BehanceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.443 5.35c.639 0 1.23 .049 1.77 .198 .541 .099 .984 .297 1.377 .544 .393 .247 .688 .594 .885 1.039 .197 .445 .295 .989 .295 1.583 0 .693-.148 1.286-.492 1.731-.295 .445-.787 .841-1.377 1.138 .836 .247 1.475 .693 1.869 1.286 .393 .594 .639 1.336 .639 2.177 0 .693-.148 1.286-.393 1.781-.246 .495-.639 .94-1.082 1.237-.443 .297-.984 .544-1.574 .692-.59 .148-1.18 .247-1.77 .247h-6.59v-13.654h6.443ZM7.049 10.891c.541 0 .984-.148 1.328-.396 .344-.247 .492-.693 .492-1.237 0-.297-.049-.594-.148-.792C8.623 8.269 8.475 8.12 8.279 7.972 8.082 7.873 7.885 7.774 7.639 7.725 7.393 7.675 7.148 7.675 6.852 7.675h-2.852v3.216h3.049ZM7.197 16.728c.295 0 .59-.049 .836-.099 .246-.049 .492-.148 .689-.297 .197-.148 .344-.297 .492-.544 .098-.247 .197-.544 .197-.89 0-.693-.197-1.187-.59-1.534-.393-.297-.934-.445-1.574-.445h-3.246v3.809h3.197ZM16.688 16.679c.394 .396 .984 .594 1.771 .594 .541 0 1.033-.148 1.426-.396 .393-.297 .639-.594 .738-.89h2.41c-.394 1.187-.984 2.028-1.771 2.573-.787 .495-1.721 .792-2.853 .792-.787 0-1.475-.148-2.115-.396-.639-.247-1.131-.594-1.574-1.088-.443-.445-.787-.989-.984-1.632-.246-.643-.344-1.336-.344-2.127 0-.742 .098-1.435 .344-2.078 .246-.643 .59-1.187 1.033-1.682 .443-.445 .984-.841 1.574-1.088 .639-.247 1.279-.396 2.066-.396 .836 0 1.574 .148 2.213 .495 .639 .346 1.131 .742 1.524 1.336 .394 .544 .689 1.187 .885 1.88 .098 .693 .147 1.385 .098 2.177h-7.131c0 .792 .295 1.534 .688 1.929ZM19.787 11.484c-.344-.346-.885-.544-1.525-.544-.443 0-.787 .099-1.082 .247-.295 .148-.492 .346-.688 .544-.197 .198-.295 .445-.344 .693-.049 .247-.098 .445-.098 .643h4.426c-.098-.742-.344-1.237-.689-1.583ZM15.459 6.29h5.508v1.336h-5.508v-1.336Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _behanceFill!!
    }

private var _behanceFill: ImageVector? = null
