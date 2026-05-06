package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Database: ImageVector
    get() {
        if (_database != null) return _database!!
        _database = radixIcon(
            name = "Database",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.501 1c1.425 0 2.733 .171 3.699 .458 .48 .143 .902 .321 1.214 .54 .299 .21 .59 .526 .59 .955 0 .008-.003 .017-.003 .025 0 .007 .003 .014 .003 .021v8.732l-.011 .154c-.049 .352-.262 .65-.53 .883-.309 .268-.735 .492-1.238 .673-1.009 .363-2.349 .557-3.724 .558C6.126 14 4.786 13.805 3.776 13.442c-.503-.181-.93-.405-1.238-.673-.269-.233-.48-.531-.529-.883l-.011-.154v-8.732c0-.008 .002-.015 .002-.022C2 2.97 1.998 2.961 1.998 2.953c0-.429 .29-.745 .589-.955 .312-.219 .734-.397 1.214-.54C4.767 1.171 6.076 1 7.501 1ZM12.097 8.301c-.251 .154-.545 .291-.872 .408-1.009 .363-2.349 .559-3.724 .559C6.126 9.268 4.786 9.072 3.776 8.709 3.449 8.591 3.155 8.455 2.904 8.301v3.432l.009 .057c.018 .068 .073 .168 .22 .295 .194 .168 .507 .346 .95 .505 .884 .318 2.115 .504 3.418 .504 1.303-0 2.533-.186 3.417-.504 .443-.159 .756-.337 .95-.505 .146-.127 .201-.227 .22-.295l.009-.057v-3.432ZM12.097 4.096c-.26 .135-.563 .254-.896 .353-.966 .287-2.274 .458-3.699 .458C6.076 4.906 4.767 4.735 3.801 4.448 3.468 4.349 3.164 4.232 2.904 4.097v2.903l.008 .057c.018 .068 .074 .168 .221 .295 .194 .168 .507 .345 .95 .504 .884 .318 2.115 .505 3.418 .505 1.303-0 2.533-.187 3.417-.505 .443-.159 .756-.336 .95-.504 .146-.127 .201-.227 .22-.295L12.097 7v-2.904ZM7.501 1.906c-1.363 0-2.58 .165-3.441 .421-.433 .129-.752 .273-.951 .413-.098 .069-.154 .128-.182 .168-.013 .019-.018 .032-.021 .038-.001 .003-.002 .005-.002 .006v.002c0 .001 .001 .003 .002 .006 .002 .006 .008 .019 .021 .038 .028 .04 .083 .099 .182 .168 .199 .14 .518 .284 .951 .413C4.921 3.835 6.138 4 7.501 4c1.363-0 2.58-.165 3.441-.421 .433-.129 .751-.273 .95-.413 .098-.069 .154-.128 .182-.168 .013-.019 .018-.032 .021-.038 .001-.003 .002-.005 .002-.006v-.002c-0-.001-.001-.003-.002-.006-.002-.006-.008-.019-.021-.038-.028-.04-.083-.099-.182-.168-.199-.14-.517-.284-.95-.413C10.081 2.071 8.864 1.906 7.501 1.906Z"),
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
        return _database!!
    }

private var _database: ImageVector? = null
