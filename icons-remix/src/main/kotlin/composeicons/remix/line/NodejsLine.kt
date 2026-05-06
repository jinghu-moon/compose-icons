package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NodejsLine: ImageVector
    get() {
        if (_nodejsLine != null) return _nodejsLine!!
        _nodejsLine = remixIcon(
            name = "NodejsLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.887 1.362c-.548-.322-1.227-.322-1.775 0L3.363 5.921c-.535 .314-.863 .888-.863 1.508v9.142c0 .62 .328 1.194 .863 1.508l2.623 1.543C7.319 20.407 9 19.445 9 17.899v-10.152h-2v10.152L4.5 16.428v-8.856L12 3.16l7.5 4.412v8.856L12 20.84 10.232 19.8 9.218 21.523l1.895 1.115c.548 .322 1.227 .322 1.775 0l7.75-4.559c.535-.314 .863-.888 .863-1.508v-9.142c0-.62-.328-1.194-.863-1.508L12.887 1.362ZM14 7.5c-1.363 0-2.329 .351-2.95 .97-.617 .615-.737 1.339-.737 1.761 0 .555 .157 1.058 .482 1.473 .312 .401 .725 .649 1.12 .811 .719 .296 1.621 .393 2.344 .47l.087 .009c.831 .09 1.454 .167 1.88 .345 .193 .081 .272 .154 .305 .197 .021 .028 .062 .09 .062 .26 0 .264-.091 .434-.373 .595-.347 .198-.961 .347-1.884 .347-.915 0-1.553-.169-1.918-.422-.283-.196-.492-.497-.437-1.15L9.989 13.001c-.108 1.289 .359 2.316 1.292 2.962 .852 .59 1.971 .777 3.056 .777 1.077 0 2.092-.164 2.873-.609 .846-.482 1.384-1.282 1.384-2.333 0-.556-.155-1.061-.477-1.479-.311-.404-.722-.657-1.118-.822-.728-.305-1.641-.403-2.369-.481h0l-.069-.007c-.833-.09-1.457-.165-1.886-.341-.194-.08-.272-.152-.303-.192-.019-.024-.058-.08-.058-.243 0-.078 .023-.219 .149-.345 .122-.122 .499-.386 1.537-.386 .991 0 1.568 .105 1.897 .301 .215 .128 .448 .363 .479 1.132l1.998-.081C18.324 9.607 17.869 8.645 16.917 8.081c-.838-.497-1.908-.581-2.917-.581Z"),
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
        return _nodejsLine!!
    }

private var _nodejsLine: ImageVector? = null
